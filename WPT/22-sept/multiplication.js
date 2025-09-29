// accept 2 numbers from user 
//   and perform multiplication 
  
//   using promise concept perform multiplication if both number 
//   are positive else reject the promise 

function mult(num1, num2) {
  return new Promise((resolve, reject) => {
  
    if (num1 >= 0 && num2 >= 0) {
      const product = num1 * num2;
      resolve(product);
    } else {
      reject(new Error("plz write positive no"));
    }
  });
}
mult(10, 5)
  .then(result => {
    console.log("Success! The result is:", result);
  })
  .catch(error => {
    console.error(error.message);
  });


