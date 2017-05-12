$(document).ready(function() {
    getPokemon();
});

var getPokemon = function() {

    $.ajax({
        type: 'Get',
        url: 'http://52.25.225.137:8080/pokemon/data/poke?sorted=true',
        dataType: 'json'
    }).done(function(data, status) {
        buildDOM(data);
    }).fail(function(xhr, status, error) {
        console.log(status + ": " + error);
    });

};

var buildDOM = function(data) {

    $('#content').empty();

    buildPokedex(data);
    buildCreatePokemonForm();
    assignListeners(data);
}

var assignListeners = function(data) {

    $('.pokemon').on('click', function(e) {

        e.preventDefault();

        var id = parseInt(this.id);
        var pokemon = data[id];

        getPokemonById(pokemon, data);
    });

    $('#createNew').on('click', function(e) {

        e.preventDefault();

        var newPokemon = {
            pokeId: $(createForm.pokeId).val(),
            name: $(createForm.name).val(),
            height: $(createForm.ht).val(),
            weight: $(createForm.wt).val(),
            img: $(createForm.img).val(),
            description: $(createForm.desc).val()
        }

        ajaxPutPokemon(newPokemon);

    })

    $('.delete').on('click', function(e) {

        e.preventDefault();

        var id = parseInt(this.id);

        ajaxDeletePokemon(id);
    });

};

var getPokemonById = function(pokemon, data) {

    $('#content').empty();
    $('#content').append('<img src=' + pokemon.img + '>');
    $('#content').append('<h2>No. ' + pokemon.pokeId + ' ' + (pokemon.name).toUpperCase() + '</h2>');

    var $h4 = $('<h4>');
    var text = '';
    pokemon.types.forEach(function(v, i, a) {
        text += ((v.name).toUpperCase() + " ");
    });

    $h4.text(text);

    $('#content').append($h4);
    $('#content').append('<h5>HT ' + pokemon.height + ' WT ' + pokemon.weight + '</h5>');
    $('#content').append('<p>' + pokemon.description + '</p>');

    var curPoke = data.indexOf(pokemon);
    var nextPokemon;
    var previousPokemon;

    if (curPoke > 0 && curPoke < data.length - 1) {
        nextPokemon = data[curPoke + 1];
        previousPokemon = data[curPoke - 1];
    } else if (curPoke <= 0) {
        nextPokemon = data[1];
        previousPokemon = data[data.length - 1];
    } else {
        nextPokemon = data[0];
        previousPokemon = data[data.length - 2];
    }


    $('#content').append('<button id="btnPrevious" type="button">Previous: ' +
        (previousPokemon.name).toUpperCase() + '</button>');
    $('#content').append('<button id="btnReturn" type="button">Return to Pokédex</button>');
    $('#content').append('<button id="btnNext" type="button">Next: ' +
        (nextPokemon.name).toUpperCase() + '</button>');


    $('button').on('click', function(e) {

        $('#content').empty();

        if (this.id === 'btnPrevious') {
            getPokemonById(previousPokemon, data);
        } else if (this.id === 'btnReturn') {
            buildDOM(data);
        } else if (this.id === 'btnNext') {
            getPokemonById(nextPokemon, data);
        } else {
            console.log("Error.");
        }

    });
};

var buildPokedex = function(data) {

    $('#content').empty();

    var $table = $('<table>');
    var $headingTr = $('<tr>');
    $headingTr.append('<th>Id</th>');
    $headingTr.append('<th>Name</th>');

    $table.append($headingTr);

    data.forEach(function(v, i, a) {
        var $pokeTr = $('<tr>');
        var $nameTd = $('<td>');
        var $idTd = $('<td>');
        var $buttonTd = $('<button>DELETE</button>');

        $buttonTd.addClass('delete');
        $buttonTd.attr('id', v.pokeId + 'Btn');

        $nameTd.addClass('pokemon');
        $nameTd.attr('id', i + 'Poke');

        $nameTd.text(v.name.toUpperCase());
        $idTd.text(v.pokeId);

        $pokeTr.append($idTd);
        $pokeTr.append($nameTd);
        $pokeTr.append($buttonTd);

        $table.append($pokeTr);
    });

    $('#content').append($table);
    $('#content').prepend('<h2>Pokédex</h2>')

}

var buildCreatePokemonForm = function() {

    var $form = $('<form>');
    $form.attr('name', 'createForm');

    var $pokeId = $('<input>');
    $pokeId.attr('type', 'text');
    $pokeId.attr('name', 'pokeId');
    $pokeId.addClass('shortForm');
    $pokeId.attr('placeholder', 'Pokédex Id');

    var $nameInput = $('<input>');
    $nameInput.attr('type', 'text');
    $nameInput.attr('name', 'name');
    $nameInput.addClass('shortForm');
    $nameInput.attr('placeholder', 'Name');

    var $htInput = $('<input>');
    $htInput.attr('type', 'text');
    $htInput.attr('name', 'ht');
    $htInput.addClass('shortForm');
    $htInput.attr('placeholder', 'HT');

    var $wtInput = $('<input>');
    $wtInput.attr('type', 'text');
    $wtInput.attr('name', 'wt');
    $wtInput.addClass('shortForm');
    $wtInput.attr('placeholder', 'WT');

    var $imgInput = $('<input>');
    $imgInput.attr('type', 'text');
    $imgInput.attr('name', 'img');
    $imgInput.attr('id', 'imgForm')
    $imgInput.attr('placeholder', 'Image');

    var $descInput = $('<textarea>');
    $descInput.attr('name', 'desc');
    $descInput.attr('placeholder', 'Please write a short description of your new Pokémon!');

    var $submitBtn = $('<Button>');
    $submitBtn.attr('type', 'button');
    $submitBtn.attr('id', 'createNew');
    $submitBtn.text('Create Your New Pokémon');

    $form.append($pokeId, $nameInput, '<br>');
    $form.append($htInput, $wtInput, '<br>');
    $form.append($imgInput, '<br>');
    $form.append($descInput, '<br>');
    $form.append($submitBtn);
    $('#content').append($form);

    $('form').prepend('<h3>Create A New Pokémon</h3>');
    $('form').prepend('<br>');

}

var ajaxPutPokemon = function(newPokemon) {

    $.ajax({
        type: 'Post',
        url: 'http://52.25.225.137:8080/pokemon/data/poke',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(newPokemon)
    }).done(function(data, status) {
        getPokemon();
    }).fail(function(xhr, status, error) {
        console.log(status + ": " + error);
    });

};

var ajaxDeletePokemon = function(id) {
    $.ajax({
        type: "Delete",
        url: 'http://52.25.225.137:8080/pokemon/data/poke/' + id
    }).done(function(data, status) {
        getPokemon();
    }).fail(function(xhr, status, error) {
        console.log(status + ": " + error);
    });
}
