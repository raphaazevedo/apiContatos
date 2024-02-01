package br.com.raphael.entities;

import java.util.List;
import java.util.UUID;

public class Categoria {
	private UUID id;
	private String nome;
	private List<Contato> contato;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

}
