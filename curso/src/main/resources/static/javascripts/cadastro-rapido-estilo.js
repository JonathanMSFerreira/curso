$(function(){
	
	var modal = $('#modalNovoEstilo');
	var botaoSalvar = modal.find('.js-botao-salvar');
	var form = modal.find('form');
	
	var url = form.attr('action');
	
	var inputNovoEstilo = $('#novoEstilo');
	
	modal.on('shown.bs.modal',onModalShow);
	modal.on('hide.bs.modal',onModalClose);
	
	botaoSalvar.on('click',onBotaoSalvarClick() );
	
	
	function onModalShow(){
		inputNovoEstilo.focus();
		
	}
	
	function onModalClose(){
		inputNovoEstilo.val('');
		
	}
	
	function onBotaoSalvarClick(){
		var nomeEstilo = inputNovoEstilo.val().trim();
		$.ajax({
			
			url :url,
			method: 'POST',
			contentType: 'apllication/json',
		
			
		});

		
	}
	
	
	
});