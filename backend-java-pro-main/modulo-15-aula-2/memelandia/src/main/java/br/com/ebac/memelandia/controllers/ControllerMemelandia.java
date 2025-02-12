
@RestController
@RequestMapping("/usuarios")
class ControllerMemelandia {
    private final List<String> usuarios = new ArrayList<>();

    @GetMapping
    public List<String> buscaUsuarios() {
        return usuarios;
    }

    @PostMapping
    public String novoUsuario(@RequestBody String usuario) {
        usuarios.add(usuario);
        return "Usuário adicionado com sucesso!";
    }
}