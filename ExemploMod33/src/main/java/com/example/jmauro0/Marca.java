package com.example.jmauro0;


@Entity
@Table(name = "TB_MARCA")
public class Marca {
	
	
	@Column(name = "NOME", length = 15, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "QNTDACESSOIRIOS", length = 20, nullable = false, unique = true)
	private Long qntdAcessorios;
	
	@Column(name = "SERVIÇOS", length = 40, nullable = false, unique = true)
	private String serviços;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQntdAcessorios() {
		return qntdAcessorios;
	}

	public void setQntdAcessorios(Long qntdAcessorios) {
		this.qntdAcessorios = qntdAcessorios;
	}

	public String getServiços() {
		return serviços;
	}

	public void setServiços(String serviços) {
		this.serviços = serviços;
	}
	
	

}
