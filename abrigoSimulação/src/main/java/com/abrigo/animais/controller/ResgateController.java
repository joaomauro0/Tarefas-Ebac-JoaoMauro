import com.abrigo.service.ResgateService;

@RestController
@RequestMapping("/resgates")
class ResgateController {
    @Autowired
    private ResgateService resgateService;

    @GetMapping("/quantidade")
    public Map<String, Long> getQuantidadeResgates(@RequestParam LocalDate inicio, @RequestParam LocalDate fim) {
        return resgateService.getResgatesPorFuncionario(inicio, fim);