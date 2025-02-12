@RestController
@RequestMapping("/memes")
class MemeController {
	 @Autowired
	    private MemeService memeService;

	    @GetMapping
	    public List<Meme> buscaMemes() {
	        return memeService.listaTodosMemes();
	    }

	    @PostMapping
	    public Meme novoMeme(@RequestBody Meme meme) {
	        return memeService.novoMeme(meme);
	    }

	    @GetMapping("/meme-do-dia")
	    public Meme memeDoDia() {
	        return memeService.memeDoDia();
	    }
}
