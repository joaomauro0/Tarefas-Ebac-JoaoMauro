package dao;

import com.jmauro0.Cliente;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente entity);

    public void excluir(Long valor);

    public void alterar(Cliente entity);

    public Cliente consultar(Long valor);

    public Collection<Cliente> buscarTodos();
}
