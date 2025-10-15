import { useState } from "react";

export default function ReactForm() {
      
    const [fName, setFName] = useState('');

    const validate = (e) => {
        e.preventDefault();
       
        console.log('Form submitted! First Name:', fName);
    }
    
    return (
        <>
            
            <form onSubmit={validate}>
                <p>
                    Enter a FirstName:
                </p>
                
                <input 
                    type="text"
                    id="fName"
                    name="fName"
                   
                    value={fName}
                    onChange={(e) => setFName(e.target.value)}
                />
                <br/>
                <input type="submit" value="Submit Form" />
            </form>
        </>
    );
}