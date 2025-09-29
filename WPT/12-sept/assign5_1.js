// <!-- 1) declare function calculate(...a) 
// 	and display addition of data 
// 	display only odd numbers from given data 

//   call calculate function with multiple parameters  -->
let sum=0;
let count=0
function calculate(...a){
	for(let i=0;i<a.length;i++){
    sum=sum+a[i];

	}
	console.log( "sum of numbers",sum);
}
function odd(...a){
	for(let i=0;i<a.length;i++){
    if(a[i]%2!=0){
		console.log(a[i]);
	}

	}
	
}
calculate(1,2,3);
console.log( "odd numbers are");
odd(1,2,3,44,7);
