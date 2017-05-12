/*
1 : Create an array literal named 'classArray' ...
The array should contain the first name of each member of your class including yourself.
*/

var classArray = ['Stephen', 'Daniel', 'Seth', 'Matt', 'Will', 'David'];

/*
2 : Evaluate the following 'shuffle' function ...
Read through the function, and determine what it is doing (annotate each line with comments). After you understand what the function is doing (and how), return the shuffled array from it.
*/

var shuffle = function (arr) {
  var randomNum, valueAtCurrIdx;
  for (var currIdx = arr.length; currIdx !== 0; currIdx--) {
    randomNum = Math.floor(Math.random() * currIdx);
    valueAtCurrIdx = arr[currIdx - 1];
    arr[currIdx - 1] = arr[randomNum];
    arr[randomNum] = valueAtCurrIdx;
  }
  return arr;
};

/*
3 : Create a function named 'makeGroupsOfNumFromArray' ...
'makeGroupsOfNumFromArray' accepts two arguments :
the first argument is a whole number indicating the size of each group
the second argument is an array of items to be grouped (in this case your classmates).
The function should shuffle the input array, and return an array of arrays, each containing a number of names indicated by 'num'.
HINT: Use the slice and push methods we discussed.
*/

var makeGroupsOfNumFromArray = function(num, group) {

  var shuffledClass = shuffle(group);
  var classArray = [];

  while(true) {

    classArray.push(shuffledClass.splice(0,num));

    if(shuffledClass.length === 0) {
      break;
    }

  }

  return classArray;

}
