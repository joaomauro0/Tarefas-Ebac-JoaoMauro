package com.abrigo.animais.demo;

public class Resgate {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @ManyToOne
	    private Funcionario funcionario;
	    @ManyToOne
	    private Animal animal;
	    private LocalDate dataResgate;
	public Resgate() {
		// TODO Auto-generated constructor stub
	}

}
