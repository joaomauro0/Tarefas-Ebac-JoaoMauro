@RestController
@RequestMapping("/memes")
class MemeController {
    private final List<String> memes = new ArrayList<>();

    @GetMapping
    public List<String> buscaMemes() {
        return memes;
    }

    @PostMapping
    public String novoMeme(@RequestBody String meme) {
        memes.add(meme);
        return "Meme adicionado com sucesso!";
    }

    @GetMapping("/meme-do-dia")
    public String memeDoDia() {
        if (memes.isEmpty()) {
            return "Nenhum meme disponível!";
        }
        Random random = new Random();
        return memes.get(random.nextInt(memes.size()));
    }
}
