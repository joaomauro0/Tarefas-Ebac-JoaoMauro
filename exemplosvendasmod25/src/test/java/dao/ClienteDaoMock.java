package dao;

import java.util.Collection;

import com.jmauro0.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException;

    {
        return true;
    }

    @Override
    public void excluir(Long valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public void alterar(Cliente entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

}
