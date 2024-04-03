public class PessoaFisica extends Pessoa {

    private int cpf;
    private int dataDeNascimento;

    public PessoaFisica(String nome, String endereco, int telefone, int cpf, int dataDeNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;

    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
