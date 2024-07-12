package com.jmauro0.DAO;

import com.jmauro0.Cliente;
import com.jmauro0.DAO.DaoGenerics.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoClasse'");
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualiarDados'");
    }

}
