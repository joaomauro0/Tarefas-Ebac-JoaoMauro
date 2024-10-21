package Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GerarConvitesService {

    private final DiscordInviteService discordInviteService;
    private final ConviteRepository conviteRepository; // Adicionamos o repositório

    @Autowired
    public GerarConvitesService(DiscordInviteService discordInviteService, ConviteRepository conviteRepository) {
        this.discordInviteService = discordInviteService;
        this.conviteRepository = conviteRepository;
    }

    // Atualizado para aceitar uma lista de emails e salvar os convites no banco de dados
    public List<String> gerarConvitesParaEmails(List<String> emails, String guildId, String channelId) {
        List<String> convites = new ArrayList<>();

        try {
            // Para cada email, gera um convite
            for (String email : emails) {
                // Gera o convite para o canal e guild correspondente
                String conviteUrl = discordInviteService.createInvite(guildId, channelId);
                convites.add(conviteUrl); // Adiciona o convite gerado à lista de convites

                // Salva o convite no banco de dados
                Convite convite = new Convite();
                convite.setEmail(email);
                convite.setConviteUrl(conviteUrl);
                conviteRepository.save(convite);  // Salva o convite no banco
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return convites;
    }
}
