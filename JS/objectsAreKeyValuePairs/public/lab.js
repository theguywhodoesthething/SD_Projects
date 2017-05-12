/*
0 : You have been provided with several data points:

- ips : an array of comma seperated IP addresses

- states : an object containing many objects representing US States

- commit : an object from the github api representing a commit

*/

/*
1 : Modify the following function such that it will return an object representing
a state from the 'states' object when it's abbreviation is provided
*/
var getStateByAbbr = function(abbr) {
/************************* Your Solution *************************/
return states[abbr];
/*****************************************************************/
}
console.log(getStateByAbbr('CO'))

/*
2 : Modify the following function to return the name of the capital of the state
by it's abbreviation
*/
var getStateCapitalByAbbr = function(abbr) {
/************************* Your Solution *************************/
return getStateByAbbr(abbr).capital;

/*****************************************************************/
}
console.log(getStateCapitalByAbbr('CO'))
/*

3 : Return an array of state objects within some distance of a provided latitude
and longitude
*/

var getStatesWithinDegreesOfLatLong = function(lat,long,distance) {
/************************* Your Solution *************************/

var statesArray = [];
for (x in states) {
  if ((Math.abs(states[x].lat - lat) < distance) &&
   (Math.abs(states[x].long - long) < distance)) {
    statesArray.push(states[x]);
  }
}
return statesArray;

/*****************************************************************/
}
console.log(getStatesWithinDegreesOfLatLong(33,-112,10))

/*
4 : Modify the following 'countProperties' function ...


Use the for...in loop to count the number of properties in the provided object.
*/

var countProperties = function(obj) {
/************************* Your Solution *************************/
var i = 0;
for (x in obj) {
  i++;
}
return i;
/*****************************************************************/
};
console.log(countProperties(states));

/*
5 : Return an object. The properties of the object should be the unique IP addresses
and the values should be the number of times that that IP address made a request
*/
var logAccessByIp = function(ips) {
/************************* Your Solution *************************/
var newObj = {};
ips.forEach((x,i,a) => {
  if(!newObj.hasOwnProperty(x)){
    newObj[x] = 1;
  } else {
    newObj[x] += 1;
  }
});
return newObj;
/*****************************************************************/
};
console.log(logAccessByIp(ips));

/*
6 : Use the provided commit JSON to format and return a new object like the following:

{
  committer : "The committer's name",
  timestamp : "The date the commit was authored",
  msg : "The commit message",
  sha : "The commit's sha"
}
*/
var formatGithubCommit = function(commit) {
/************************* Your Solution *************************/
var newObj = {};
newObj["committer"] = commit.author.name;
newObj["timestamp"] = commit.committer.date;
newObj["msg"] = commit.message;
newObj["sha"] = commit.tree.sha;
return newObj;
/*****************************************************************/
};

console.log(formatGithubCommit(commit));
