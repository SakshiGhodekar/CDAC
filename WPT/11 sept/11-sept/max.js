// 7) To Find max number from array write code in 3 ways as shown in lecture 

 let a=[6,5,7,4,2]
 function max1(){
 let max =a[0]
 for(let i=0;i<a.length;i++){
    if(a[i]>max)
    {
        max=a[i]
    }
 }
 console.log(max)
}
max1()
function max2(){
    let max=a[0]
    a.forEach(element => {
        if(element>max){
            max=element
        }
    });
    console.log(max)
}
max2()

function max3(){
    let max=a[0]
    for(const i in a){
        if(a[i]>max)
        {
            max=a[i]
        }
    }
    console.log(max)
}
max3()

function max4(){
    a.sort((p, q) => p - q); // Sort the array in ascending order

    return a[a.length - 1]; // Return the last element
    
}
console.log(max4())




