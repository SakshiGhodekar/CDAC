// 3)   accept command line args input from user 
//  between 1 -  5 
//  if input is valid then display * pattern output 
 
//  if input is 3 then display
//  * * *
//  * *
//  *
//   if number is not other that 1 to 5 then throw the error 
//   and display error message 

let a= parseInt(process.argv[2]);

if(a<=5){
   
for (let i = a; i > 0; i--) {
  console.log('* '.repeat(i).trim());
}
    
}
    try{
        if(a>5||a==0){
          throw "msg";
        }
    }catch(exception ){
       console.log("plz not enter greater than 5 number");
    }

