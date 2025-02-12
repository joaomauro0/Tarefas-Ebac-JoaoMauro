@Entity
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date dataCadastro = new Date();

    @ManyToOne
    private CategoriaMeme categoriaMeme;
}
