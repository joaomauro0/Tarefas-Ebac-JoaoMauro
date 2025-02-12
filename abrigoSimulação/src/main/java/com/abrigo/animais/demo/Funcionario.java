package com.abrigo.animais.demo;

public class Funcionario {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

}
