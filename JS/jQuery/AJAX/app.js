$(document).ready(function() {

  console.log("PAGE LOADED");

  var data = null;
  var xhr = new XMLHttpRequest();

  xhr.open('GET', 'https://kkane106.github.io/data.json');

  xhr.onreadystatechange = function() {
    if(xhr.readyState === 4 && xhr.status < 400){
      data = JSON.parse(xhr.responseText);

      data.forEach(function(v,i,a){
        $div = $('<div>');

        $div.text(v.fname + " " + v.lname);

        $('body').append($div);
      });

    } else if (xhr.status >= 400){
      console.log("Error occured. " + xhr.status + ": " + xhr.responseText);
    }
  }

  xhr.send(null);

});
