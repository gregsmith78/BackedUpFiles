function sleepIn(weekday, vacation) {
	if ( !weekday || vacation) {
	    return true;
}   else {
	    return false;
}
};
console.log(sleepIn(false, false));
console.log(sleepIn(true, false));
console.log(sleepIn(false, true));

function monkeyTrouble(aSmile, bSmile) {
	if (aSmile && bSmile) {
		return true;
}   else if (!aSmile && !bSmile) {
	    return true;
}   else {
        return false;
}
};
console.log(monkeyTrouble(true, true));
console.log(monkeyTrouble(false, false));
console.log(monkeyTrouble(true, false));

function sumDouble(a, b) {
	var sum = (a + b);
	return sum;
	if (a === b) {
		return (sum * 2);
	}

};
console.log(sumDouble(1, 2));
console.log(sumDouble(3, 2));
console.log(sumDouble(2, 2));

function diffTwentyOne(n) {
	if (n <= 21) {
		return (21 - n);
} 
};

console.log(diffTwentyOne(19));
console.log(diffTwentyOne(10));
console.log(diffTwentyOne(21));

function talkingParrot (talking, hour) {
	if (talking && (hour < 7 || hour > 20)) {
		return true;
	} else {
		return false;
	}

};
console.log(talkingParrot(true, 6));
console.log(talkingParrot(true, 7));
console.log(talkingParrot(false, 6));

function fibonacci (n) {
	if (n === 0 || n=== 1){
		return 1;
	}
		var x = 1;
		var y = 1;
		var t = x + y;
	
	for(var i = 2; i < n; i+=){
		x = y;
		y = t;
		t = x + y;
		return t;
	}
};
console.log(fibonacci(7));