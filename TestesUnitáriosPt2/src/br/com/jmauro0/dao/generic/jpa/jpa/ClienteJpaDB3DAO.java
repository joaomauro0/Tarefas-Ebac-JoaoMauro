/**
 * 
 */
package br.com.jmauro0.dao.generic.jpa.jpa;

import br.com.rpires.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.rpires.domain.jpa.ClienteJpa2;


public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}