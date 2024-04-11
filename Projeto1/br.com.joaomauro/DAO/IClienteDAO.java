package br.com.joaomauro.dao;

import br.com.joaomauro.domain.Cliente;

import java.util.Collection;
import java.util.List;

public interface IClienteDAO {

    public boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
