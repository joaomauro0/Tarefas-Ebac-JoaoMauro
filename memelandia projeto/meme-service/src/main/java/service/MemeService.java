@Service
public class MemeService {
    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public Meme memeDoDia() {
        List<Meme> memes = repositorioMeme.findAll();
        return memes.isEmpty() ? null : memes.get(new Random().nextInt(memes.size()));
    }
}
