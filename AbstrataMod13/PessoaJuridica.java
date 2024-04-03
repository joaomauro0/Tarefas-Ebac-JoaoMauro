public class PessoaJuridica extends Pessoa {

    private int cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, int cpf, int dataDeNascimento) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}