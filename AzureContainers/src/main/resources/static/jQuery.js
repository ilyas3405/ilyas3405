 
// json data

window.alert('hello');

var api = '/blob/getrootfolders';
// button trigger

$('#view-doctors').on('click',function() {      
	
	var button = $(this);      

   $.ajax({
      url:api,
      method:'GET',
      cache:false,
      type:"text/json"
   })
   .always(function(){
      $(button).html('Load Doctor Data...');
   })
   .done(function(evt) {
      // Disable button
      $(button).prop('disabled',true);
      // Set timeout for lazy loading
      setTimeout(function(){
         var result = JSON.parse(evt);
         var html = '<h2>Data Dokter</h2>';
         html += '<div class="tables-doctor-content">hello from .js file>';
    
            }
         }
         html +='</div>';
         // Set all content
         $('.tables-doctor').html(html);
     },1000); 
   })
   .fail(function() {
      alert('Error : Failed to reach API Url or check your connection');
      $(button).prop('disabled',false);
   })
   .then(function(evt){
      setTimeout(function(){        
         $(button).css({'background-color':'#ccc'}).hide();          
      },1000);
   });
});