import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

@SpringBootApplication
public class DiscordInviteBotApplication {

    private static final String APPLICATION_NAME = "Discord Invite Bot";
    private static final String CREDENTIALS_FILE_PATH = "src/main/resources/credentials.json";

    public static void main(String[] args) {
        SpringApplication.run(DiscordInviteBotApplication.class, args);
    }

    // Bean para criar o cliente Sheets da API do Google
    @Bean
    public Sheets sheets() throws IOException, GeneralSecurityException {
        JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();

        // Carregar as credenciais da API do Google
        GoogleCredential credential = GoogleCredential.fromStream(new FileInputStream(CREDENTIALS_FILE_PATH))
                .createScoped(Collections.singleton(SheetsScopes.SPREADSHEETS));

        // Configurar e retornar o cliente Sheets
        return new Sheets.Builder(httpTransport, jsonFactory, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }


    @Bean
    public CommandLineRunner run(GoogleSheetsService googleSheetsService, GerarConvitesService gerarConvitesService) {
        return args -> {
            try {
                // 1. Ler os emails da planilha
                List<String> emails = googleSheetsService.lerEmailsDaPlanilha(); // Leitura dos emails da planilha
                
                // 2. Gerar convites para os emails
                List<String> convites = gerarConvitesService.gerarConvitesParaEmails(emails, "1288511546233716767", "1291059354761429053");

                // 3. Atualizar a planilha com os convites gerados
                googleSheetsService.atualizarConvites(emails, convites); // Atualiza a planilha com os convites gerados
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
     // Verificação para ver se o caminho do arquivo de credenciais é correto
        if (!new File(CREDENTIALS_FILE_PATH).exists()) {
            throw new FileNotFoundException("Arquivo de credenciais não encontrado em: " + CREDENTIALS_FILE_PATH);
        }

        GoogleCredential credential = GoogleCredential.fromStream(new FileInputStream(CREDENTIALS_FILE_PATH))
                .createScoped(Collections.singleton(SheetsScopes.SPREADSHEETS));

    }
}
