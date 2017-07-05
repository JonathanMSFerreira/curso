 $(function() {
    var decimal = $('.js-decimal');
   
    decimal.maskMoney({decimal:",",thousands:"."});
    
    var natural = $('.js-natural');
    
    natural.maskMoney({precision:0, thousands:"." }); 
    
  })
  
  
  $(function(){
	  
	var settings = {
		type: 'json',
		filelimit: 1,
//		allow: '*.(jpg,jpeg,png)',
		action: '/foto/novo',
		complete:function(resposta){
			
			$('input[name=descricaoImagem]').val(resposta.descricao);
			$('input[name=tipoImagem]').val(resposta.tipo);
			$('input[name=imagem]').val(resposta.imagem);
			
		}
	}  
	  
	UIkit.uploadSelect($('#upload-select'),settings);
	UIkit.uploadDrop($('#upload-drop'),settings);
	   
  });
 
