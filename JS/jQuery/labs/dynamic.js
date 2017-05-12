// Create a page load event listener
// Inside of this function create a form element using js and assign it an name
// Create two input field elements and append them to the form element
// Create a submit button and append it to the form
// Append the form to the body

$(document).ready(function() {
    config();

});

var config = function() {

    var $ol = $('<ol>');

    var $newForm = $('<form name="newForm">');
    $newForm.append($('<input type="text" name="fname">'));
    $newForm.append($('<input type="text" name="lname">'));
    var $button = ($('<button type="button" name="button">').text('Submit!'));
    $newForm.append($button);

    $button.on('click', function(e) {

        e.preventDefault();

        var $form = $(this);

        console.log($form);

        var $fname = $(newForm.fname).val();
        var $lname = $(newForm.lname).val();

        console.log($fname);
        console.log($lname);

        $ol.append($('<li>').append($fname + " " + $lname));

        $('body').append($ol);

    });

    $('body').append($newForm);

};
