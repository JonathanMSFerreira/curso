package com.curso.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.curso.storage.RunnableStorageFoto;


@RestController
@RequestMapping("foto")
public class FotoController {

	
	
	@PostMapping("/novo")
	public DeferredResult<String> upload(@RequestParam("files[]") MultipartFile[] imagens) {

		DeferredResult<String> storageImagem = new DeferredResult<>();
		
		Thread threadUploadImagem = new Thread(new RunnableStorageFoto(imagens, storageImagem ));
		
		threadUploadImagem.start();

		return storageImagem;

	}


}
