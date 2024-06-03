
import java.util.List;

public class NomesList {

    private String nome;
    private String genero;
    private int idade;

    public NomesList() {
    }

    public NomesList(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public NomesList(NomesList nomes) {
        this(nomes.getNome(), nomes.getGenero(), nomes.getIdade());
    }

    public List<NomesList> NomesGeneros() {
        NomesList nome1 = new NomesList("João", "Masculino", 21);
        NomesList nome2 = new NomesList("Davi", "Masculino", 34);
        NomesList nome3 = new NomesList("Beyoncé", "Feminino", 42);
        NomesList nome4 = new NomesList("Pedro", "Masculino", 45);
        NomesList nome5 = new NomesList("Karen", "Feminino", 22);
        return List.of(nome1, nome2, nome3, nome4, nome5);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "NomesList [nome=" + nome + ", genero=" + genero + ", idade=" + idade + "]";
    }

}
