// <!-- 
// Write 6 Function in Script 
	
// 	display 
// 	addition 
// 	subtraction
// 	multiply
// 	division 
// 	calculate
	
// 	Accept data from user 
// 		2 numbers and Which Operation they want to perform
//   according to choice call particular function and display result 
// using callback function concept 

//     calculate(n1 , n2 , mcallBack)
// 		addition (n1 , n2 , display);
// 		 -->
// let a=parseInt(prompt("enter first no"));
// let b=parseInt(prompt("enter 2nd number"));


function display(result) {
    console.log("Result:", result);
}


function addition(n1, n2, callback) {
    let result = n1 + n2;
    callback(result);
}

function subtraction(n1, n2, callback) {
    let result = n1 - n2;
    callback(result);
}


function multiply(n1, n2, callback) {
    let result = n1 * n2;
    callback(result);
}


function division(n1, n2, callback) {
    if (n2 === 0) {
        callback("Error: Division by zero");
    } else {
        let result = n1 / n2;
        callback(result);
    }
}

function calculate(n1, n2, mCallBack) {
    mCallBack(n1, n2, display);
}


let num1 = parseFloat(prompt("Enter first number:"));
let num2 = parseFloat(prompt("Enter second number:"));
let operation = prompt("Enter operation (add, sub, mul, div):").toLowerCase();


switch (operation) {
    case "add":
        calculate(num1, num2, addition);
        break;
    case "sub":
        calculate(num1, num2, subtraction);
        break;
    case "mul":
        calculate(num1, num2, multiply);
        break;
    case "div":
        calculate(num1, num2, division);
        break;
    default:
        console.log("Invalid operation");
}
