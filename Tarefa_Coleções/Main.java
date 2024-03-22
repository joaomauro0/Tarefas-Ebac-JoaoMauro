import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ListagemDeNomes();
        ListagemDeNomesEGeneros();
    }

    public static void ListagemDeNomes() {
        System.out.println("***** Nomes *****");
        Set<String> nome = new TreeSet<String>();

        nome.add("João Mauro");
        nome.add("Maria Bethânia");
        nome.add("Michael Jackson");
        nome.add("Beyoncé Knowles-Carter");
        System.out.println(nome);
    }

    public static void ListagemDeNomesEGeneros() {
        System.out.println("***** Nomes e gêneros *****");
        Set<String> nomes = new HashSet<String>();

        nomes.add("João Mauro - m");
        nomes.add("Maria Bethânia - f");
        nomes.add("Michael Jackson - m");
        nomes.add("Beyoncé Knowles Carter - f");

        Set<String> nomeM = new HashSet<>();
        Set<String> nomeF = new HashSet<>();

        for (String nomeGenero : nomes) {
            // Dividindo cada elemento em nome e gênero
            String[] partes = nomeGenero.split(" - ");
            String nome = partes[0];
            String genero = partes[1];

            // Adicionando o nome ao conjunto apropriado
            if (genero.equals("m")) {
                nomeM.add(nome);
            } else if (genero.equals("f")) {
                nomeF.add(nome);
            }
        }

        // Imprimindo os conjuntos de nomes masculinos e femininos
        System.out.println("Nomes Masculinos: " + nomeM);
        System.out.println("Nomes Femininos: " + nomeF);
    }
}