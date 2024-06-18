
import java.util.List;
import java.util.Objects;
public class NomesList {

	private String nome;
	private int idade;
	private String genero;
	
	
	public NomesList() {}
	
	public NomesList(String nome, int idade, String genero) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}
	
	public NomesList(NomesList nomes) {
		 this(nomes.getNome(), nomes.getGenero(), nomes.getIdade());
	}
	
	
	public  List<NomesList> NomesGeneros(){
		NomesList nome1 = new NomesList("João", 21, "Masculino");
		NomesList nome2 = new NomesList("Davi", 34, "Masculino");
		NomesList nome3 = new NomesList("Beyoncé", 42, "Feminino");
		NomesList nome4 = new NomesList("Pedro", 45, "Masculino");
		NomesList nome5 = new NomesList("Karen", 22, "Feminino");
		return List.of(nome1, nome2, nome3, nome4, nome5);
	} 
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NomesList other = (NomesList) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
	
	
	
	
}
