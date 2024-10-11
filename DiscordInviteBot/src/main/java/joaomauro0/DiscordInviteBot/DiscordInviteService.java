package joaomauro0.DiscordInviteBot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.Guild;

@Service
public class DiscordInviteService {

    private final JDA jda;

    public DiscordInviteService(@Value("${discord.bot.token}") String token) {
        try {
            System.out.println("Token recebido: " + token); // Log para depuração
            this.jda = JDABuilder.createDefault(token).build();
        } catch (Exception e) {  // Captura qualquer exceção e relança como RuntimeException
            throw new RuntimeException("Erro ao inicializar JDA com o token do bot", e);
        }
    }

    public String createInvite(String guildId, String channelId) {
        Guild guild = jda.getGuildById(guildId);
        if (guild != null) {
            Invite invite = guild.getTextChannelById(channelId)
                                 .createInvite()
                                 .setMaxUses(1)       // Um único uso
                                 .setMaxAge(0)        // Tempo ilimitado
                                 .complete();
            return invite.getUrl();  // Retorna a URL do convite
        }
        return null;
    }
}
