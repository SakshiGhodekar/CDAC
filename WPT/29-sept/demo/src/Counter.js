
// 2) create Counter Application with useState
import { useState } from "react";

function Counter(){
    let [count,update]=useState(0);

  function handler(){
  
    update(count+1);

  }

 
    return(
        <div>
            <h1>{count}</h1>
            <button onClick={handler}>Click</button>
        </div>
    );
}
export default Counter;