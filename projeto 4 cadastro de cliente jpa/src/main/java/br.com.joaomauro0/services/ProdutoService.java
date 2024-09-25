/**
 * 
 */
package br.com.joaomauro0.services;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.domain.Produto;
import br.com.rpires.services.generic.GenericService;

/**
 * @author joaomauro0
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}