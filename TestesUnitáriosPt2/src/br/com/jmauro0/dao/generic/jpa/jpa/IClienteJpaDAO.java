/**
 * 
 */
package br.com.jmauro0.dao.generic.jpa.jpa;

import br.com.rpires.dao.generic.jpa.IGenericJapDAO;
import br.com.rpires.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}