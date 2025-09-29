import { Component } from "react";

export default class Factorial extends Component {
 
    constructor(props) {
        super(props)  
        this.a = props.num1
    }

    myeventHandler(e) {
        console.log(e.target);
        console.log(e.target.value);
        console.log("in event handler ")

        if (e.target.value == 'Factorial') {
           
        }
        
    }
    render() {
        return (
            <>
                <h1>Factorial of Number</h1>
                Enter a number <input
                    type="text" id="t1"
                    onBlur={(e) => { console.log(e.target.value) }}

                ></input>

                <button value="Factorial" onClick={this.myeventHandler}>
                check
                </button>

            </>
        )

    }


}