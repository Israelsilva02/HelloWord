package com.israel.helloword.bsm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/BSM")

public class AtividadeBSM {
	
	@GetMapping
	public String helloWord() {
		return "Responsabilidade pessoal\r\n" + "Mentalidade de crescimento\r\n" 
	+ "Orientação ao futuro\r\n" + "Persistência\r\n" + "Comunicação\r\n" 
				+ "Orientação aos Detalhes\r\n" + "Trabalho em equipe\r\n" + "Proatividade\r\n";
	}

}
