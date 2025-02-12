@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date dataCadastro = new Date();

    // Getters e Setters
}
