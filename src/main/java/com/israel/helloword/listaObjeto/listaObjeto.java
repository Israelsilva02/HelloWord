package com.israel.helloword.listaObjeto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Lista de Objetivos")
public class listaObjeto {
	@GetMapping
	public String helloWord() {
		return "\nLista de Objetivos" + "\n1- Definir as Funcionalidades do Projeto" 
	+ "\n2- Começar a desenvolver o projeto" 
				+ "\n3- Dividir as tarefas do Projeto ";
	}
}
