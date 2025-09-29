//  Write a recursive function in Node.js to print factorial of number 

// number accept by command line Args



function factorial(a) {
    if (a === 0 || a === 1) {
        return 1;
    }
    
    return a * factorial(a - 1);
    }


let a = parseInt(process.argv[2]);
let result = factorial(a);
console.log(result);
