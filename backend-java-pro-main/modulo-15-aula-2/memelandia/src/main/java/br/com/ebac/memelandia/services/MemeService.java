@Service
class MemeService {
    @Autowired
    private RepositorioMeme repositorioMeme;

    @Autowired
    private RestTemplate restTemplate;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public Meme memeDoDia() {
        List<Meme> memes = repositorioMeme.findAll();
        if (memes.isEmpty()) {
            return null;
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(memes.size());
        return memes.get(randomIndex);
    }
}