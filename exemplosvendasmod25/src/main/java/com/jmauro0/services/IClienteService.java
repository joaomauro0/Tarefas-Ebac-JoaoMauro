package com.jmauro0.services;

import com.jmauro0.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarporCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;;
}
