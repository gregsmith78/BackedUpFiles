"use strict";

function happy(input) {  
  var input = prompt("Please pick a number between 1 and 1000", "");
  var numb = input.toString();
  var number = numb.split("");
    var digsArry = parseInt([number]);
/*

function getUserInput () {
	var number = prompt ("Please pick up a number between 1 and 1,000", "");
	var leftCharacter = number.charAt(0);
	var parNum = parseInt(leftCharacter);
	    return parNum;

}
console.log(getUserInput()); */
/*
function secondRightNumber(number) {
	var toBeString = number;
	var numbersPlucked = toBeString.substring(1,2);
	var parRightNum = parseInt(numbersPlucked);
	return parRightNum;
}
console.log(secondRightNumber(654)); */
/*
function secondNumbs(str) {
var str;
var x = str.toString();
var z = x.substring(1,3);
console.log(z);
}
secondNumbs(345);
*/
function splitright2Nums() {
	var
}
/*
function myNewFunction(myValue) {
    alert('Howdy, '+ myValue);
}
myNewFunction('Craig');
*/

function max(numb1, numb2) {

    if (numb1 > numb2) {
    	return numb1;
    } else {
    	return numb2;
    }

}
console.log(max(22,23));

function maxOfThree(num1, num2, num3) {
    if (num1 > num2 && num1 > num3) {
    	return num1;
   } else if (num1 < num2 && num2 > num3) {
        return num2;
   } else {
   	return num3;
   }

}
console.log(maxOfThree(331,453,100));

function checkForVowel(c) {
    if (c === "a" || c === "e" || c === "i" || c === "o" || c === "u") {
    	return true;
    } else{
    	return false;
    }
}
console.log(checkForVowel(a));

function translate() {

}

/*```js// study this example!!!
function queue(arr, item) {
  // Your code here
  
  return item;  // Change this line
}

// Test Setup
var testArr = [1,2,3,4,5];

// Display Code
console.log("Before: " + JSON.stringify(testArr));
console.log(queue(testArr, 6)); // Modify this line to test
console.log("After: " + JSON.stringify(testArr));
``` */
/*var fullName = "";
var name;
var firstLetter;

function fixName () {
firstLetter = name.substring(0, 1);
name = firstLetter.toUpperCase() + name.substring(1);
fullName = fullName + " " + name;
};

name = prompt("Enter your first name (all in lower case):");
fixName();



name = prompt("Enter your second name (all in lower case):");
fixName();


console.log("And your full name is:" + fullName);
*/
var lost = [4, 8, 15, 16, 23, 42];
var count = lost.length;

var isLost = function (n) {
  for (var i = 0; i < 6; i++ ) {
    if ( n === lost[i]) {
      return true;
    }
  }
  return false;
};

if ( isLost(12) ) {
  console.log('12 is a lost number');
}

if ( isLost(16) ) {
  console.log('16 is a lost number');
}