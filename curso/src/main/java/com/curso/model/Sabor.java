package com.curso.model;

public enum Sabor {

	ADOCICADA("Adocicada"),
	FORTE("Forte"),
	SUAVE("Suave"),
	MALTADA("Maltada");

	private String descricao;

	Sabor(String descricao) {

		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}
	
}
