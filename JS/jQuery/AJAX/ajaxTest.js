$(document).ready(function() {

    console.log("PAGE READY");

    $.ajax({
            type: 'Get',
            url: 'https://kkane106.github.io/data.json',
            dataType: 'json'
        })
        .done(function(data, status) {
            buildDom(data);
        })
        .fail(function(xhr, status, error) {
            console.log(status + ": " + error);
        });
});

var buildDom = function(data) {
    data.forEach(function(v, i, a) {
        $div = $('<div>');
        $div.text(v.fname + " " + v.lname);
        $('body').append($div);
    });
}
