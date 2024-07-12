import com.jmauro0.Cliente;
import com.jmauro0.DAO.IClienteDAO;

public class ClienteDAOTest {

    private IClienteDAO ClienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        ClienteDAO = new clienteDAOMock();

    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(123456789L);
        cliente.setNome("João");
        cliente.setCidade("RJ");
        cliente.setEnd("End");
        cliente.setEstado("RJ");
        cliente.setNumero(21);
        cliente.setTel(12345678L);
        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = ClienteDAO.buscarporCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado)
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = ClienteDAO.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        ClienteDAO.excluir(cliente.getCpf());
    }

    public void alterarCliente() {
        cliente.setNome("João Mauro");
        ClienteDAO.alterar(cliente);
    }
}
