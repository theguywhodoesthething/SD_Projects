var $h1 = $('h1');
var $ul = $('ul');
var stringArray = ['PG','SG','SF','PF','C'];

$h1.text('hello your name');
$ul.children().each( function(i) {
  $(this).text(stringArray[i]);
});
