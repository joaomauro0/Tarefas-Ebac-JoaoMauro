@RestController
@RequestMapping("/categorias")
public class CategoriaMemeController {
    @Autowired
    private CategoriaMemeService categoriaMemeService;

    @GetMapping
    public List<CategoriaMeme> buscaCategorias() {
        return categoriaMemeService.listaTodasCategorias();
    }

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return categoriaMemeService.novaCategoria(categoriaMeme);
    }
}
