 $(function() {
    var decimal = $('.js-decimal');
   
    decimal.maskMoney({decimal:",",thousands:"."});
    
    var natural = $('.js-natural');
    
    natural.maskMoney({precision:0, thousands:"." }); 
    
  })