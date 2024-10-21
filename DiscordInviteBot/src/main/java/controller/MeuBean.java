import org.springframework.stereotype.Component;
import jakarta.faces.bean.ManagedBean;

@jakarta.annotation.ManagedBean
@Component
public class MeuBean {

    private String nome;

    public void salvar() {
        System.out.println("Nome salvo: " + nome);
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
