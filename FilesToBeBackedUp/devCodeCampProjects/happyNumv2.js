"use strict";

var number = prompt("Please pick a number between 1 and 1000", "");


function happySlappy() {
    var keepChecking = true;
    var numSplit;
    var alreadyCheckedNums = [];
    var squared;
    var sumOfSquares = 0;
    var counter = 0;
        //while (sumOfSquares < 50) {
            numSplit = number.toString().split("");
            for (var i = 0; i < numSplit.length; i++) {
                    numSplit[i] = parseInt(numSplit[i], 10);
                    
            }
                for(var j = 0; j < numSplit.length; j++) {
                       sumOfSquares += Math.pow(numSplit[j], 2);
                
                  
            }
        if (sumOfSquares === 1) {
            console.log (numSplit + " is a happy number");
            keepChecking = false;
        } else {
            happySlappy(sumOfSquares);
            return false;

        }
        
        
           
console.log(sumOfSquares);
}                                //}Math.pow(arr[i],2);
happySlappy();
    /*var squareArry = [];
        for(var i = 0; i < numSplit.length; i++) {
          numSplit[i] = parseInt(numSplit[i], 10);
          numSplit = newNumber;
           if (newNumber === 1) {
            console.log(newNumber + " is happy");
             return false;
             break;
           } 
      }
    }
} 
*/
//console.log(numSplit); 

 

/*function happy() {
    var digsArry = [];
    var sadNumbers = []; 
    var squaredNum = 0; 
    var number = input.toString().split("");
        for(var i = 0; i < number.length; i++) {
            digsArry[i] = parseInt(number[i], 10);
console.log(digsArry);          
        }
        for(var j = 0; j < number.length; j++) {
            squaredNum += Math.pow(digsArry[j], 2);
console.log(squaredNum);          
        }
    }
happy();
       /* if (squaredNum === 4 || squaredNum === 25 || squaredNum === 16 || squaredNum === 89) {
            console.log (number + " is a sad number");
                return false;
        } else {
            (squaredNum === 1) 
            console.log (number + " is a happy number")
            return happy(squaredNum);
        } */ 


        /*for(var i=0; i<number.length; i++){
        number[i] = Number(Math.pow([number[i]],2));
console.log(number);
    var squaredSum = number[0] + number[1] + number[2];
    var newSquaredSum = squaredSum;
        
    var number = input.split("");
number = Number(Math.pow(number,2));

console.log(newSquaredSum); 
    
}*/
//You need to loop through and parse/convert the elements in your array
//}
//happy(); 
    

//If the string you are searching for does not exist, indexOf returns -1
























