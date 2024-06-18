
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class NomesListTest {

    @Test
    public void testListaApenasMulheres() {
        NomesList nomesList = new NomesList();
        List<NomesList> lista = nomesList.NomesGeneros();

        List<NomesList> mulheres = lista.stream()
                .filter(NomesGeneros -> NomesGeneros.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

       
        boolean apenasMulheres = mulheres.stream()
                .allMatch(nomes -> nomes.getGenero().equalsIgnoreCase("Feminino"));

        assertTrue("A lista contém apenas mulheres", apenasMulheres);
    }
}
