function display(result){
   console.log("result :",result);
}


let result;
function add(n1,n2,call){
    result=n1+n2;
   display(result);
}
function mult(n1,n2,call){
    result=n1*n2;
    display(result);
}



let num1 = parseInt(prompt("Enter first number:"));
let num2 = parseInt(prompt("Enter second number:"));
let operation = prompt("Enter operation :add,mult").toLowerCase();

switch(operation){
    case "add":
       add(num1,num2,add);
    break;
    case "mult":
        mult(num1,num2,mult);
    break;    
}
