import org.junit.Test;

import com.jmauro0.Cliente;
import com.jmauro0.DAO.ClienteDAO;
import com.jmauro0.services.ClienteService;
import com.jmauro0.services.IClienteService;

import dao.ClienteDaoMock;
import dao.IClienteDAO;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException;

    {
        cliente = new Cliente();
        cliente.setCpf(123456789L);
        cliente.setNome("João");
        cliente.setCidade("RJ");
        cliente.setEnd("End");
        cliente.setEstado("RJ");
        cliente.setNumero(21);
        cliente.setTel(12345678L);

    }

    @Test
    public void pesquisarCliente(){

       

        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado)
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException;

    {
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException;

    {
        clienteDAO.alterar(cliente);
        cliente.setNome("João Mauro");
        Assert.assertEquals("João Mauro", cliente.getNome())
    }
}
