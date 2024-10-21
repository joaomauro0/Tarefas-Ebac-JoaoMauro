package Service;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class GoogleSheetsService {

    private Sheets sheetsService;
    private static final String SPREADSHEET_ID = "1udlX57T4x0whGuU5I6xQ1Co5jRFPAAF3zXEj8sDOLGk"; // Coloque seu ID da planilha aqui

    
    public GoogleSheetsService(Sheets sheetsService) {
        this.sheetsService = sheetsService;
    }

    // 1. Método para ler os emails da planilha
    public List<String> lerEmailsDaPlanilha() throws IOException {
        String range = "Página1!A2:A";  // Define o intervalo da coluna de emails
        ValueRange resposta = sheetsService.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();

        List<List<Object>> valores = resposta.getValues();
        List<String> emails = new ArrayList<>();

        if (valores != null && !valores.isEmpty()) {
            for (List<Object> linha : valores) {
                if (!linha.isEmpty()) {
                    emails.add(linha.get(0).toString());  // Adiciona o email à lista
                }
            }
        }
        return emails;
    }

 // 2. Método para atualizar a planilha com emails e convites
    public void atualizarConvites(List<String> emails, List<String> convites) throws IOException {
        if (emails.size() != convites.size()) {
            throw new IllegalArgumentException("O número de emails e convites deve ser o mesmo.");
        }

        String range = "Página1!A2:B" + (emails.size() + 1);  // Intervalo para emails e convites

        List<List<Object>> valores = new ArrayList<>();
        for (int i = 0; i < emails.size(); i++) {
            List<Object> linha = new ArrayList<>();
            linha.add(emails.get(i));   // Adiciona o email
            linha.add(convites.get(i)); // Adiciona o convite correspondente
            valores.add(linha);         // Adiciona a linha (email + convite)
        }

        // Atualiza a planilha com os emails e convites
        ValueRange body = new ValueRange().setValues(valores);
        sheetsService.spreadsheets().values()
                .update(SPREADSHEET_ID, range, body)
                .setValueInputOption("RAW")  // Define a opção RAW para inserir diretamente os valores
                .execute();

        System.out.println("Planilha atualizada com emails e convites.");
    }

    }

