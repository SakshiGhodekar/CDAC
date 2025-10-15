import { useEffect, useRef, useState } from "react"

export default function RefFunction() {
    
    let x = useRef(null) 
    let y = 100

    let [s1, setS1] = useState("")


    useEffect(() => {
      
        x.current = 20
    }, [])

  
    return (
        <div>
            <input
                type="text"
                onChange={(e) => {
                    
                    x.current = e.target.value
                    
                    

                    setS1(e.target.value)
                }}
            />

            <p>
                
                x (Ref) = {x.current} 
                <br></br>
                
                y (Variable) = {y} 
                <br></br>
                s1 (State) = {s1}
            </p>
        </div>
    )
}