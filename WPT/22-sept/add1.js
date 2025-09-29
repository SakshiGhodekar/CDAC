// 4)Accept 10 munbers  from Command Line Args and store in array 
//   then display 
//   1) addition of even numbers only 
//   2) addition of even index numbers
//   3) addition of prime numbers 

function isPrime(num) {
  if (num <= 1) return false;
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) return false;
    

  }
  return true;
}

if (process.argv.length < 12) { 
  console.error("enter 10 numbers");
  process.exit(1);
}
const numbers = process.argv.slice(2, 12).map(Number);
console.log("Input numbers:", numbers);
let even = 0;
let sumEvenIndex = 0;
let Prime = 0;
for (let i = 0; i < numbers.length; i++) {
  const currentNum = numbers[i];
  if (currentNum % 2 === 0) {
    even += currentNum;
  }


  if (i % 2 === 0) {
    sumEvenIndex += currentNum;
  }

  if (isPrime(currentNum)) {
    Prime += currentNum;
  }
}

console.log("\n1) Addition of even numbers:", even);
console.log("2) Addition of numbers at even indices:", sumEvenIndex);
console.log("3) Addition of prime numbers:", Prime);



