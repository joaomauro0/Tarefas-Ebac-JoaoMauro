package br.com.jmauro.domain;

@entity
@Table(name = "TB_Produto")
public class Produto {
	
	@Column(name = "NOME", varchar = 40, nullable = false, unique = false)
	private String nome;
	
	@Column(name = "PRECO", length = 10, nullable = false, unique = false)
	private Integer preco;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="prod_seq")
	@SequenceGenerator(name="prod_seq", sequenceName="sq_prod", initialValue = 1, allocationSize = 1)
	private String codigo;

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
