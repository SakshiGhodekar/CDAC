// 5)  USINF REPL concept 

//     write function which has for loop to display 
// 	current date -  dd-mm-yyyy format 
// 	then save that script in myDate.js file 
function display(n) {
    for (let i = 0; i < n; i++) {
        const now = new Date();
        const day = String(now.getDate()).padStart(2, '0');
        const month = String(now.getMonth() + 1).padStart(2, '0'); 
        const year = now.getFullYear();
        console.log(`${day}-${month}-${year}`);
    }
    
}
display(5);
