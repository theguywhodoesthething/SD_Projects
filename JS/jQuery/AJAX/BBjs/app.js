$(document).ready(function() {

    $('#bbBtn').on('click', function(e) {
        e.preventDefault;

        if (this.name === 'initialShow') {
            $(this).text('Hide Teams');
            $(this).attr('name', 'hide');
            initialShow();
        } else if (this.name === 'show') {
            $(this).text('Hide Teams');
            $(this).attr('name', 'hide');
            $('#bbUl').show();
        } else {
            $(this).text('Show Teams');
            $(this).attr('name', 'show');
            $('#bbUl').hide();
        }
    });
});

var initialShow = function() {

    console.log('in initialShow');

    $.ajax({
        type: 'Get',
        url: '/Users/mattgmur/Desktop/JS/jQuery/AJAX/BBjs/data.json',
        dataType: 'json'
    }).done(function(data, status) {
      buildTable(data);
    }).fail(function(xhr, status, error) {
      console.log(status + ": " + error);
    });

};

function buildTable(data) {

    console.log(data);

    data.forEach(function(v, i, a) {
        var $li = $('<li>');
        var $a = $('<a>');
        $a.attr('href', v.url);
        $a.text(v.name);
        $li.append($a);
        $('#bbUl').append($li);
    });
};
