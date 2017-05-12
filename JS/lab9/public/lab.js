/*
1 : Invoke a function named 'greet', pass your name to the function as an
argument ...

***NOTE:*** At the moment, this will throw `ReferenceError: greet is not defined`
*/

/***********Your Solution************/
greet("Bobby");
/************************************/

/*
2 : Write a function **declaration** named 'greet' which takes one argument (name).

'greet' should return the string 'Hello {name}' where {name} is the name provided
as an argument.
*/

/***********Your Solution************/
function greet(name) {
  return "Hello " + name;
};

/************************************/

/*
3 : Invoke a function named 'farewell', pass your name to the function as an
argument ...

***NOTE:*** This function will also throw `ReferenceError: greet is not defined`
*/

/***********Your Solution************/
try {
  farewell("Bobby");
} catch (e) {

} finally {

}
/************************************/

/*
4 : Write a function **expression** named 'farewell', the assigned function
should take one argument ('name').

'farewell' should return the string 'Goodbye {name}' where {name} is the name
provided as an argument.

***NOTE:*** The correct solution to this exercise will produce a TypeError. It
is important that you understand why this error (instead of a `ReferenceError`)
is produced. With your pair think about how the JS interpreter is evaluating the
function expression and try to determine exactly what is happening. If you can
not discern why a TypeError has occured ask an instructor for help.
*/

/***********Your Solution************/
var farewell = function(name) {
  return "Goodbye " + name;
}
/************************************/

/*
5 : Create a new function **expression** named 'sayHello', assign it the value
of the 'greet' function declaration.

Invoke 'sayHello' and pass it your name. What is the result?

***NOTE***: At first this code will be unreachable because of the unrecoverable
error encountered in your solution to #3. This is a fairly common problem in
JavaScript development, if the interpreter encounters an error in a chain of
function executions it will just stop executing the chain...making it seem as
though things just aren't working. Usually this results from a value being
`undefined` when it needed to be something else (e.g. a function). Surround that
answer in a `try/catch` in order to allow the interpreter to continue.
*/

/***********Your Solution************/
var sayHello = greet;
sayHello("Matt");
/************************************/

/*
6 : Create a function expression named 'interact'.

Assign interact an anonymous function.

This function should have three parameters:

* The first parameter 'begin', will be passed a function which returns a string

* The second parameter 'end', will also be passed a function which returns a
string

* The third parameter 'name', will be a string

Within the body of 'interact', invoke 'begin' with the 'name', and concatenate
it's return value with a space (" ") followed by the return value of 'end' invoked
with 'name'. Return the resulting string.
*/

/***********Your Solution************/
var interact = function(begin, end, name) {
  return begin(name) + ' ' + end(name);
}
/************************************/

/*
7 : Invoke 'interact', pass it three arguments:

* your 'sayHello' function expression

* your 'farewell' function expression

* your name

If you don't understand what is happending, modify your anonymous function in #6
to log the values of begin and end to the console.
*/

/***********Your Solution************/
interact(sayHello, farewell, "Matt");
/************************************/
