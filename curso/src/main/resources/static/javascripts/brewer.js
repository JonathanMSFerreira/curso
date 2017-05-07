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
		action: '/foto/novo'
	}  
	  
	UIkit.uploadSelect($('#upload-select'),settings);
	UIkit.uploadDrop($('#upload-drop'),settings);
	   
  });
 
 
 