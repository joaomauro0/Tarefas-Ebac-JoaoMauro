package com.example.jmauro0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessório {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACESSORIO_seq")
	@SequenceGenerator(name="ACESSORIO_seq", sequenceName="sq_ACESSORIO", initialValue = 1, allocationSize = 1)
	private Long id;

	
	@Column(name = "FABRICANTE", length = 20, nullable = false, unique = true)
	private String fabricante;
	
	@Column(name = "NOME", length = 10, nullable = false)
	private String nome;
	
	@OneToOne(mappedBy = "Acessório")
	private Carro carro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
}
