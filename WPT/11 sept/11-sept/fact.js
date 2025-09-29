
// 1) Write a function getFactorialImpl ( choice="FORLOOP" ) ----it could be FORLOOP or RECUR
// 	Function Fact2(n1)
// 	Use recursion and print the factorial
// 	If the choice is FORLOOP return Fact1
// 	If the choice is RECUR then return Fact2
// 	Outside --- call let rv = getFactorialImpl("RECUR")
// 	rv(3)
// 	Rv = getFactorialImpl()
// 	rv(5)



let fact=1;

function fact2(n){
  for(let i=1;i<=n;i++){
    fact=fact*i;
  }
  return fact;
};

function fact1(n){
   if(n==0 ||n==1){
    return 1;
   }
   return n* fact1(n-1);
  
};
 


let f=fact2(5);
console.log("factrorial of no using loop :",f);
let f1=fact1(5);
console.log("factrorial of no using recursion:",f1);

// let c =1;

// switch(c){
// case 1:
//   fact1();
//   break;

// case 2:
//   fact2();
//   break;
// }