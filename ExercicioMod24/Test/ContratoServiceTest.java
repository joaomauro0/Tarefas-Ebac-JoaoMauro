package Test;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import src.service.ClienteService;
import src.service.dao.ClienteDao;
import src.service.dao.ClienteDaoMock;
import src.service.dao.IClienteDao;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao1 = new ContratoDao();
        IContratoService service1 = new ContratoService(dao1);
        String retorno = service1.excluir();
        Assert.assertEquals("Excluído", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoexcluirTest() {
        IContratoDao dao1 = new ClienteDao();
        IContratoService service1 = new ClienteService(dao1);
        String retorno = service1.excluir();
        Assert.assertEquals("Excluído", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao1 = new ContratoDao();
        IContratoService service1 = new ContratoService(dao1);
        String retorno = service1.atualizar();
        Assert.assertEquals("atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoatualizarTest() {
        IContratoDao dao2 = new ClienteDao();
        IContratoService service2 = new ClienteService(dao2);
        String retorno = service2.atualizar();
        Assert.assertEquals("atualizado", retorno);
    }
}