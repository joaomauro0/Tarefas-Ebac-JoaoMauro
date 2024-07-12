package com.jmauro0.services;

import com.jmauro0.Cliente;
import com.jmauro0.DAO.ClienteDAO;
import com.jmauro0.DAO.IClienteDAO;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = ClienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return clienteDAO.cadastrar(cliente)
    }

    @Override
    public Cliente buscarporCPF(Long cpf) {
        // TODO Auto-generated method stub
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    {
        clienteDAO.alterar(cliente);
    }

}
