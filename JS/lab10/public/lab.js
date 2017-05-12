/*
1 : Write a function named 'reverse' ...

This function will take one argument, a string.

Return the submitted string with the characters in reverse order.

***NOTE*** Do not use the 'reverse' method on the String object, write your own.
*/

/************** Your Solution Here ****************/
var reverse = function(string) {
  var newString = '';
  for(var i = string.length - 1; i > -1; i--) {
    newString += string.charAt(i);
  }
  return newString;
}
/**************************************************/

/*
2 : Write a function named 'palindromeChecker' ...

This function will take one argument, a string.

If the provided string is a palindrome (the same backwards and forwards), return
true, otherwise return false.
*/

/************** Your Solution Here ****************/
var palindromeChecker = function(string) {
  return reverse(string) == string;
}
/**************************************************/

/*
3 : Write a function named 'isPrime' ...

This function will take one argument, a whole number.

If the provided number is prime, return true, otherwise, return false.
*/

/************** Your Solution Here ****************/
var isPrime = function(num) {

array = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
   71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
    157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233,
    239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
    331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
    421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503,
    509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607,
    613, 617, 619, 631, 641, 643, 647, 653, 659];

for (var i = 0; i < array.length; i++) {
  if (num % array[i] === 0) {
    return false;
  } else if (num < (array[i] * array[i])) {
    return true;
  }
}

return null;

}

/**************************************************/

/*
4 : Write a function named 'computeTax'.

This function will take one or two arguments.

* The first argument will always be the amount tendered.

* The second argument, which is optional, could be the tax percentage (as a
whole number). If no second argument is provided, assume the tax rate is 7.5%.

Once applying the correct amount of tax, return the amount of tax owed.
*/

/************** Your Solution Here ****************/

/**************************************************/

/*
5 : Write a function named 'calculateTotal'.

This function will take two arguments:

* The first argument is the amount owed.

* The second argument is a function which calculates tax.

  * 'calculateTotal' will use this function to calculate the amount of tax owed
  based on the amount owed. It will add this amount to the amount owed to
  calculate the total bill.

For now, assume we are passing the 'computeTax' function as the second argument.
Return the total amount owed with tax.
*/

/************** Your Solution Here ****************/

/**************************************************/

/*
6 : Write a function named 'calculateTotalWithTax'.

This function will take three arguments:

* The first & second arguments are the same as the previous calculateTotal
function

* The third argument is 'tax', the amount of tax owed.

Pass the 'tax' parameter to the function included as the second argument, this
should result in the provided tax being used by the 'computeTax' function.
*/

/************** Your Solution Here ****************/

/**************************************************/
