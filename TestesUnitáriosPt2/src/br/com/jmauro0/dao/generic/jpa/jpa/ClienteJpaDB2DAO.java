/**
 * 
 */
package br.com.jmauro0.dao.generic.jpa.jpa;

import br.com.rpires.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.rpires.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}