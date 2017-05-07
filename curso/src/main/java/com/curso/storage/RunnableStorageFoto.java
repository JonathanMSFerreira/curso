package com.curso.storage;

import java.io.IOException;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.curso.dto.ImagemDto;

public class RunnableStorageFoto implements Runnable{

	
	private MultipartFile[] imagens;

	DeferredResult<ImagemDto> storageImagem;
	
	
	
	
	public RunnableStorageFoto(MultipartFile[] imagens, DeferredResult<ImagemDto> storageImagem) {
	
		this.imagens = imagens;
		this.storageImagem = storageImagem;
	}

	
	@Override
	public void run() {
	
		
		//Método assíncrono para salvar a imagem no servidor
	
		String descricao =  imagens[0].getOriginalFilename();
		String tipo = 	imagens[0].getContentType();
		byte[] imagem;
		
		try {
			imagem = imagens[0].getBytes();
			storageImagem.setResult(new ImagemDto(descricao, tipo, imagem));
			
			System.err.println("cheguei aqui!");
			
		} catch (IOException e) {
			new  RuntimeException("Erro ao persistir imagem!",e);
		}
		
		
		
		
	}
	
	
	
	
	

}
