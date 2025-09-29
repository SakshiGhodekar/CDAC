import { useState,useEffect } from "react";
// 3) in 2nd Assignment --  add useEffect 
//       display table of that counter value on page when counter 
//    is incremented

function CounterEffect(){
      let[count,update]=useState(0)
//   useEffect(()=>{
    //   update(count + 1)
//   },[count])
    function handler(){
        update(count+1);
    }
    return(
        
        <div>
        <button onClick={handler}>counter table</button>
        <h3>{count}</h3>
        <h3>{count*2}</h3>
        <h3>{count*3}</h3>
        <h3>{count*4}</h3>
        <h3>{count*5}</h3>
        <h3>{count*6}</h3>
        <h3>{count*7}</h3>
        <h3>{count*8}</h3>
        <h3>{count*9}</h3>
         <h3>{count*10}</h3>
        </div>
    );
}
export default CounterEffect;