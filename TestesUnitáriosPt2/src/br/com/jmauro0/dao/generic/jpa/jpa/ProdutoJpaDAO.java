/**
 * 
 */
package br.com.jmauro0.dao.generic.jpa.jpa;

import br.com.rpires.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rpires.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}