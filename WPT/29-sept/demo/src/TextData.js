import React, { useState } from "react";

// 4) Accept Data in textfield and onBlur event display that 
//    data as List Order List in webpage

function TextData(){
 let [value,setValue]= useState(" ")
    function handler(){
    console.log("event blured");
    }
   
return(
    <>
    <h1>enter full name:</h1>
    <input type="text" placeholder="enter name"value={value}
     onChange={(e) => setValue(e.target.value)}onBlur={handler}>
     </input>
    {/* <button onBlur={handler}> Submit</button> */}
    </>
)



}
export default TextData; 