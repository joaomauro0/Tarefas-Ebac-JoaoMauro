package com.abrigo.service;

public class ResgateService {

	public ResgateService() {
		// TODO Auto-generated constructor stub
		 @Autowired
		    private ResgateRepository resgateRepository;
		    
		    public Map<String, Long> getResgatesPorFuncionario(LocalDate inicio, LocalDate fim) {
		        List<Resgate> resgates = resgateRepository.findByDataResgateBetween(inicio, fim);
		        return resgates.stream().collect(Collectors.groupingBy(r -> r.getFuncionario().getNome(), Collectors.counting()));
	}

}
