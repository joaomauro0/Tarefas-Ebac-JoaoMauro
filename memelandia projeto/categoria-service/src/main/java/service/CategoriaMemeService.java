@Service
public class CategoriaMemeService {
    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme novaCategoria(CategoriaMeme categoria) {
        return repositorioCategoriaMeme.save(categoria);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
