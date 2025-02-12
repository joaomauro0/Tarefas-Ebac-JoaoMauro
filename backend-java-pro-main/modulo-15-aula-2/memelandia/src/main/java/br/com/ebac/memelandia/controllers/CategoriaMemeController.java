
@RestController
@RequestMapping("/categorias")
class CategoriaMemeController {
    private final List<String> categorias = new ArrayList<>();

    @GetMapping
    public List<String> buscaCategorias() {
        return categorias;
    }

    @PostMapping
    public String novaCategoria(@RequestBody String categoria) {
        categorias.add(categoria);
        return "Categoria adicionada com sucesso!";
    }
}