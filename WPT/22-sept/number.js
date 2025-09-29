// 4) Write a Node program that prints all the numbers between 1 and 100, each on a separate line.
// A few caveats:
// o if the number is divisible by 3, print "foo"
// o if the number is divisible by 5, print "bar"
// o if the number is divisible by both 3 and 5, print "foobar"


// let n=100;

// for(let i=1;i<=n;i++){
//     console.log(i);
// }
function number(){
let n=1;
while(n<=100){
   
    if(n%3==0){
        console.log(n ," is foo");
    }else if(n%5==0){
        console.log(n ,"bar");
    }else if(n%3==0 && n%5==0){
        console.log(n ,"full bar");
    }
    else{
     console.log(n);
    }
   n++
}
}
number();
