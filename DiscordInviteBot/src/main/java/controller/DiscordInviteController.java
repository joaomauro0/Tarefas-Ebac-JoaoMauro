package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.DiscordInviteService;

// Classe auxiliar para receber os parâmetros via JSON
class InviteRequest {
    private String guildId;
    private String channelId;

    // Getters e Setters
    public String getGuildId() {
        return guildId;
    }

    public void setGuildId(String guildId) {
        this.guildId = guildId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}

@RestController
@RequestMapping("/discord")
public class DiscordInviteController {

    private static final Logger logger = LoggerFactory.getLogger(DiscordInviteController.class);

    private final DiscordInviteService discordInviteService;

    @Autowired
    public DiscordInviteController(DiscordInviteService discordInviteService) {
        this.discordInviteService = discordInviteService;
    }

    @PostMapping("/gerar-convite")
    public ResponseEntity<String> gerarConvite(@RequestBody InviteRequest inviteRequest) {
        String guildId = inviteRequest.getGuildId();
        String channelId = inviteRequest.getChannelId();

        logger.info("Recebendo requisição para gerar convite com guildId: {}, channelId: {}", guildId, channelId);
        try {
            logger.info("Chamando o serviço para gerar convite");
            String conviteUrl = discordInviteService.createInvite(guildId, channelId);

            if (conviteUrl != null) {
                logger.info("Convite gerado com sucesso: {}", conviteUrl);
                return ResponseEntity.ok("Convite gerado com sucesso: " + conviteUrl);
            } else {
                logger.warn("Falha ao gerar o convite. Verifique guildId e channelId.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao gerar o convite. Verifique guildId e channelId.");
            }
        } catch (Exception e) {
            logger.error("Erro ao gerar convite", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao gerar convite: " + e.getMessage());
        }
    }
}
