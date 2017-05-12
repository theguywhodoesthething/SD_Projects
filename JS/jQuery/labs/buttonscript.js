$(document).ready(function() {
  config();
});

var config = function(){
  $('#myDiv').on('click', function(e){
    if($(this).text() === 'On!'){
      $(this).text('Off!');
    } else {
      $(this).text('On!');
    }
  });
}
