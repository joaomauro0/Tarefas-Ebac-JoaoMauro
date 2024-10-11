package joaomauro0.DiscordInviteBot;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanilhaService {

    public List<String> lerEmailsDePlanilha(String caminhoArquivo) throws IOException {
        List<String> emails = new ArrayList<>();
        
        FileInputStream file = new FileInputStream(caminhoArquivo);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);  // Pega a primeira aba da planilha

        for (Row row : sheet) {
            Cell cell = row.getCell(0);  // Supomos que os emails estão na primeira coluna
            if (cell != null) {
                emails.add(cell.getStringCellValue());
            }
        }
        workbook.close();
        file.close();
        
        return emails;
    }
}
