package com.curso.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

public class RunnableStorageFoto implements Runnable{

	
	private MultipartFile[] imagens;

	DeferredResult<String> storageImagem;
	
	
	public RunnableStorageFoto(MultipartFile[] imagens, DeferredResult<String> storageImagem) {
	
		this.imagens = imagens;
		this.storageImagem = storageImagem;
	}

	
	@Override
	public void run() {
	
		
		//Método assíncrono para salvar a imagem no servidor
		
		System.err.println("Tamanho: "+ imagens.length);
		
		storageImagem.setResult("Imagem recebida com sucesso");
		
	}
	
	
	
	
	

}
