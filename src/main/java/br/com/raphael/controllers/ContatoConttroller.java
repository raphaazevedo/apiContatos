package br.com.raphael.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphael.entities.Contato;
import br.com.raphael.repositories.ContatoRepository;

@RestController
@RequestMapping(value = "/api/contatos")
public class ContatoConttroller {

	@GetMapping
	public List<Contato> getAll()throws Exception{
		
		
		ContatoRepository contatoRepository = new ContatoRepository();
		return contatoRepository.findAll();
				
	}
}
