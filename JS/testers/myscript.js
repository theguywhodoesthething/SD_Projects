// In a .js file, create a function expression named forEach. forEach should accept two parameters, array and func.
//
// forEach will iterate over the array, calling func and passing it the current value, current index, and the entire array with each iteration.
//
// Create an array of numbers (100 - 110) named nums
//
// Invoke forEach, passing it nums and an anonymous function that takes three parameters (val...the current value,index, and array), in the body of the anonymous function, use console.log to print out the value, index and entire for each iteration.


function forEach(array, func) {
  for (var i = 0; i < array.length; i++) {
    func(array[i], i, array);
  }
}

nums = [100,101,102,103,104,105,106,107,108,109,110];

forEach(nums, function(val, index, array) {console.log("val: " + val + " index: " + index + " array: " + array)});
