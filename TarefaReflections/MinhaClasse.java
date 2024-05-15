import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;

@Tabela(nome = "minha_tabela")
public class MinhaClasse {

    public static void main(String[] args) {
        // Obter a classe MinhaClasse
        Class<?> classe = MinhaClasse.class;

        // Verificar se a anotação Tabela está presente na classe
        if (classe.isAnnotationPresent(Tabela.class)) {
            // Obter a instância da anotação Tabela
            Tabela tabela = classe.getAnnotation(Tabela.class);

            // Obter o nome da tabela da anotação
            String nomeTabela = tabela.nome();

            // Imprimir o nome da tabela no console
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A anotação Tabela não está presente na classe.");
        }
    }
}
