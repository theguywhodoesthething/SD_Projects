var usStates = [
    { name: 'ALABAMA', abbr: 'AL'},
    { name: 'ALASKA', abbr: 'AK'},
    { name: 'ARIZONA', abbr: 'AZ'},
    { name: 'ARKANSAS', abbr: 'AR'},
    { name: 'CALIFORNIA', abbr: 'CA'},
    { name: 'COLORADO', abbr: 'CO'},
    { name: 'CONNECTICUT', abbr: 'CT'},
    { name: 'DELAWARE', abbr: 'DE'},
    { name: 'DISTRICT OF COLUMBIA', abbr: 'DC'},
    { name: 'FLORIDA', abbr: 'FL'},
    { name: 'GEORGIA', abbr: 'GA'},
    { name: 'HAWAII', abbr: 'HI'},
    { name: 'IDAHO', abbr: 'ID'},
    { name: 'ILLINOIS', abbr: 'IL'},
    { name: 'INDIANA', abbr: 'IN'},
    { name: 'IOWA', abbr: 'IA'},
    { name: 'KANSAS', abbr: 'KS'},
    { name: 'KENTUCKY', abbr: 'KY'},
    { name: 'LOUISIANA', abbr: 'LA'},
    { name: 'MAINE', abbr: 'ME'},
    { name: 'MARYLAND', abbr: 'MD'},
    { name: 'MASSACHUSETTS', abbr: 'MA'},
    { name: 'MICHIGAN', abbr: 'MI'},
    { name: 'MINNESOTA', abbr: 'MN'},
    { name: 'MISSISSIPPI', abbr: 'MS'},
    { name: 'MISSOURI', abbr: 'MO'},
    { name: 'MONTANA', abbr: 'MT'},
    { name: 'NEBRASKA', abbr: 'NE'},
    { name: 'NEVADA', abbr: 'NV'},
    { name: 'NEW HAMPSHIRE', abbr: 'NH'},
    { name: 'NEW JERSEY', abbr: 'NJ'},
    { name: 'NEW MEXICO', abbr: 'NM'},
    { name: 'NEW YORK', abbr: 'NY'},
    { name: 'NORTH CAROLINA', abbr: 'NC'},
    { name: 'NORTH DAKOTA', abbr: 'ND'},
    { name: 'OHIO', abbr: 'OH'},
    { name: 'OKLAHOMA', abbr: 'OK'},
    { name: 'OREGON', abbr: 'OR'},
    { name: 'PENNSYLVANIA', abbr: 'PA'},
    { name: 'RHODE ISLAND', abbr: 'RI'},
    { name: 'SOUTH CAROLINA', abbr: 'SC'},
    { name: 'SOUTH DAKOTA', abbr: 'SD'},
    { name: 'TENNESSEE', abbr: 'TN'},
    { name: 'TEXAS', abbr: 'TX'},
    { name: 'UTAH', abbr: 'UT'},
    { name: 'VERMONT', abbr: 'VT'},
    { name: 'VIRGINIA', abbr: 'VA'},
    { name: 'WASHINGTON', abbr: 'WA'},
    { name: 'WEST VIRGINIA', abbr: 'WV'},
    { name: 'WISCONSIN', abbr: 'WI'},
    { name: 'WYOMING', abbr: 'WY' }
];

$(document).ready(function() {
    config();
    // listen();
});

var config = function(){
  $('#statesBtn').on('click', function(e){
    e.preventDefault;

    if(this.name === 'show'){
      $(this).text('Hide States');
      $(this).attr('name', 'hide');
      showStates();
    } else {
      $(this).text('Show States');
      $(this).attr('name', 'show');
      hideStates();
    }



  });
}

var showStates = function(){

  var $headingTr = $('<tr>');
  $headingTr.append($('<th>Name</th>'));
  $headingTr.append($('<th>Abbr</th>'));

  $('#statesTble').append($('<caption>US States</caption>'));
  $('#statesTble').append($headingTr);

  usStates.forEach(function(v,i,a){

    var $statesTr = $('<tr>');
    var $nameTd = $('<td>');
    var $abbrTd = $('<td>');

    $nameTd.text(v.name);
    $abbrTd.text(v.abbr);

    $statesTr.append($nameTd);
    $statesTr.append($abbrTd);

    $('#statesTble').append($statesTr);

  });
}

var hideStates = function(){

  $('#statesTble').empty();

}
