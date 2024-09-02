package com.example.jmauro0;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@entity
@Table(name = "TB_CARRO")
public class Carro {

	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARRO_seq")
	@SequenceGenerator(name="CARRO_seq", sequenceName="sq_CARROO", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "MARCA", length = 10, nullable = false, unique = true)
	private String Marca;
	
	@Column(name = "COR", length = 15, nullable = false, unique = true)
	private String Cor;

	@OneToMany(mappedBy = "Carro")
	private Acessório acessorio;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	
	
}
