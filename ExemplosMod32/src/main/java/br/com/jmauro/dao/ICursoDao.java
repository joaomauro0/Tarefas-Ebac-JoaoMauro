/**
 * 
 */
package br.com.jmauro.dao;

import java.util.List;

import br.com.rpires.domain.Curso;

/**
 * @author jmauro
 *
 */
public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}