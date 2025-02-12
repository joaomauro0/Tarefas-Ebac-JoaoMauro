package com.abrigo.animais.demo;

public class Animal {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String tipo;
	    private String raca;
	    private String cor;
	    private String porte;
	    private int idade;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}

}
