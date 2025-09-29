import { useState,useEffect, use } from "react";
 function Lifecycle(){
    let[count,update]=useState(0);

   useEffect(()=>{
    update(count+1)

   },[count]);

   function handler(){
       update(count+1)
   }
    return(
        <>
    
         <h1>{count}</h1>
          <button onClick={handler}>click</button>
        </>
    )
 }
 export default Lifecycle;