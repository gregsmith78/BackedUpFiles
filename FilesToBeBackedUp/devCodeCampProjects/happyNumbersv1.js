
 /*<input type = "submit" value = "Click me" onclick = "myNewFunction();" /> */
/*function happy() {  
	var input = prompt("Please pick a number between 1 and 1000", "");
    var number = input.split("");
console.log(number);
        for(var i=0; i<number.length; i++){
        number[i] = Number(Math.pow([number[i]],2));
console.log(number);
    var squaredSum = number[0] + number[1] + number[2];
    var newSquaredSum = squaredSum;
        
   function happy() {
    var digsArry = [];
    var sadNumbers = []; 
    var squaredNum = 0; 
    var number = input.toString().split("");
        for(var i = 0; i < number.length; i++) {
            digsArry[i] = parseInt(number[i], 10);
console.log(digsArry);          
        }
        for(var j = 0; j < digsArry.length; j++) {
            squaredNum += Math.pow(digsArry[j], 2);
console.log(squaredNum);           


console.log(newSquaredSum);
    
}
//You need to loop through and parse/convert the elements in your array
}
 happy(); */
function squareRooting(num) {
    var sum = num * num;
    return sum;
}
function splittingFunc(){
	var x = squareRooting();
	
}
console.log(splittingFunc(7));
/*
function convertInputToString (number) { 
	 var numbAsString = number.toString();
        return numbAsString;
        console.log (numbAsString);
  

}
convertInputToString();




function getUserData(message) {
   var userData;
   userData = window.prompt(message);
   return userData;




/*function isPrime (n) {
	var divisor = 2;
	while (n > divisor) {
		if ( n % divisor == 0) {
			return false;
	  } else {
	  	divisor++;
	  	    return true;

		}
	}
}
console.log(isPrime(137));
console.log(isPrime(237));
*/
/*function getUserInput () {
	var number = prompt ("Please pick up a number between 1 and 1,000", "");
	var leftCharacter = number.charAt(0);
	var parNum = parseInt(leftCharacter);
	    return parNum;
*/



/*
	    console.log(input(642));
}
getLeftMostDigit();




//trying to get the first character of a string

  var firstChar = userNumString.charAt(0);
    var parsedNumb = parseInt(firstChar);
        return parsedNumb;
        console.log(parsedNumb);

        */

        
/*function getLeftMostDigit (getUserInput) {
	var parNum = leftCharacter
	var gFC = getUserInput;
	var makeAString = gFC.toString();
    var leftCharacter = makeAString.charAt(0);
	    return (leftCharacter);
	}
console.log(getLeftMostDigit());


/*function strings () {
	var toBeString = "Make this statement a string";
	var nowString = toBeString.toString();
	return nowString;
	*/
/*	function happy(number) {
    var m, digit ;
    var cycle = [] ;
 
    while(number != 1 && cycle[number] !== true) {
        cycle[number] = true ;
        m = 0 ;
        while (number > 0) {
            digit = number % 10 ;
            m += digit * digit ;
            number = (number  - digit) / 10 ;
        }
        number = m ;
    }
    return (number == 1) ;
}
 
var cnt = 8 ;
var number = 1 ;
 
while(cnt-- > 0) {
    while(!happy(number))
        number++ ;
    console.log(number + " ") ;
    number++ ;
}
console.log(happy(7));
*/