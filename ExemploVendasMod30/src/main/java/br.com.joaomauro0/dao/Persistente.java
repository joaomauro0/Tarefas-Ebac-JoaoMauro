package br.com.joaomauro0.dao;

/**
 * @author joaomauro0
 *
 * Classe que representa todas as entidades ou objetos da aplicação que seram salvas no banco de dados
 */
public interface Persistente {

    //public Long getCodigo();
	
	public Long getId();
	
	public void setId(Long id);
}