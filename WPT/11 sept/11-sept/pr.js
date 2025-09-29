// console.log("sakshi");

const arr=[1,33,22,44];
let largest =arr[0];

 arr.forEach(element => {
    if( element > largest ){
        largest=element;
    }
 });
 console.log("largest element :",largest);