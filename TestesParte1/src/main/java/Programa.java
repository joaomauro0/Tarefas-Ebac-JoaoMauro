import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Programa {

    public static void main(String[] args) {

        System.out.println("LISTA FEITA POR SPLIT");
        // String fixa com os dados
        String dados = "João,Masculino,21,Davi,Masculino,34,Beyoncé,Feminino,42,Pedro,Masculino,45,Karen,Feminino,22";
        // Dividir a string de dados em partes individuais
        String[] entries = dados.split(",");
        List<NomesList> nomesList1 = new ArrayList<>();

        // Criar objetos NomesList a partir das partes divididas
        for (int i = 0; i < entries.length; i += 3) {
            String nome = entries[i].trim();
            String genero = entries[i + 1].trim();
            int idade = Integer.parseInt(entries[i + 2].trim());
            nomesList1.add(new NomesList(nome, genero, idade));

        }
        nomesList1.forEach(System.out::println);
        System.out.println("LISTA FEITA POR STREAM E FILTER");

        List<NomesList> lista = new NomesList().NomesGeneros();
        List<NomesList> homens = lista.stream()
                .filter(NomesGeneros -> NomesGeneros.getGenero().equalsIgnoreCase("Masculino"))
                .collect(Collectors.toList());

        List<NomesList> mulheres = lista.stream()
                .filter(NomesGeneros -> NomesGeneros.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
        System.out.println("Lista de homens ");
        homens.forEach(homem -> System.out.println(homem.getNome()));
        System.out.println("Lista de mulheres ");
        mulheres.forEach(mulher -> System.out.println(mulher.getNome()));

    }

}