function calculate(number) {
	var val = number * 10;
	console.log(val);
};
calculate(40);
function quarter(integar) {
	return integar / 4;
};
if (quarter(432) % 3 === 0) {
	console.log("This statement is true");
} else {
	console.log("This statement is false");

};

function sleepCheck(numHours) {
    if (numHours >= 8) {
        return "You're getting plenty of sleep! Maybe even too much!";
} else {
        return "Get some shut eye!";
    }
};
console.log(sleepCheck(10));
console.log(sleepCheck(5));
console.log(sleepCheck(8));

function max(number1, number2) {
	if (number1 < number2) {
		return "My number is higher than yours";
	} else {
		return "My number is greater than yours";

	}
	};
console.log(max(33, 29));