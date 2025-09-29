

// 3)   Try File Handling Write and Read data synchronous method 
//    and try asynchronous method 

const fs = require('fs');

try {
  fs.writeFileSync('example.txt', 'Hello everyone...');
  console.log('File successfull ');
} catch (err) {
  console.error('Error', err);
}
