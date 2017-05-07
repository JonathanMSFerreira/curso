package com.curso.dto;

public class ImagemDto {
	
	
	private String descricao;
	
	
	private String tipo;


	private byte[] imagem;
	
	
	
	public ImagemDto(String descricao, String tipo, byte[] imagem) {
		super();
		this.descricao = descricao;
		this.tipo = tipo;
		this.imagem = imagem;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public byte[] getImagem() {
		return imagem;
	}


	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	
	
	
	
	
	
	

}
