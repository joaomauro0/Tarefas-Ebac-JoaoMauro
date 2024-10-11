package joaomauro0.DiscordInviteBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GerarConvitesService {

    private final DiscordInviteService discordInviteService;
    private final GoogleSheetsService googleSheetsService;

    @Autowired
    public GerarConvitesService(DiscordInviteService discordInviteService, GoogleSheetsService googleSheetsService) {
        this.discordInviteService = discordInviteService;
        this.googleSheetsService = googleSheetsService;
    }

    // Atualizado para aceitar uma lista de emails e retornar uma lista de convites
    public List<String> gerarConvitesParaEmails(List<String> emails, String guildId, String channelId) {
        List<String> convites = new ArrayList<>();

        try {
            // Para cada email, gera um convite
            for (String email : emails) {
                // Gera o convite para o canal e guild correspondente
                String conviteUrl = discordInviteService.createInvite(guildId, channelId);
                convites.add(conviteUrl); // Adiciona o convite gerado à lista de convites
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return convites;
    }

    }
}
