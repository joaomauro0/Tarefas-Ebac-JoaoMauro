public class programa extends Pessoa {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("Lucas", "Realengo", 21697772, 00000000001, 10 / 15 / 2001);

        System.out.println("Nome cidadão físico: " + pessoaFisica.getNome() + " Endereço: " + pessoaFisica.getEndereco()
                + " Telefone: " + pessoaFisica.getTelefone()
                + " portador do cpf: " + pessoaFisica.getCpf() + " Data de nascimento: "
                + pessoaFisica.getDataDeNascimento());

    }

}