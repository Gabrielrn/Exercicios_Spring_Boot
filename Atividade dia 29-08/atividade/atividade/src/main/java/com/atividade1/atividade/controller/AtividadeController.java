package com.atividade1.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")

public class AtividadeController {
	
	@GetMapping
	public String atividade1() {
		return "Hello World!" 
				+ "\n\nBSM'S:"
				+ "\nOrientação ao Futuro" 
				+ "\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\nTrabalho em Equipe"
				+ "\nOrientação ao Detalhe"
				+ "\nProatividade"
				+ "\nComunicação"
				+ "\n\nObjetivo de aprendizagem da semana: "
				+ "\nContinuar meu curso de Java na Udemy";
	}
}
