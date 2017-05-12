$(document).ready(function() {
    config();

});
var config = function() {
    $(newForm.submit).click(function(e) {

        e.preventDefault();

        var email = $(newForm.email).val();
        var username = $(newForm.username).val();

        console.log(email);
        console.log(username);

        newForm.reset();

        // console.log(email);
        // console.log(username);
        //
        // $('#email').text(email);
        // $('#username').text(username);

        var $h1 = $('<h1>');
        $h1.text('Hello World');
        $('body').append($h1);

    });
};
