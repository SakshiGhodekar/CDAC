import { Component } from "react";

export default class Factorial extends Component {
  
    constructor(props) {
        super(props)  
        this.a = props.num1
        this.ans = 1;
        this.eventHandler = this.myeventHandler.bind(this)
    }

    doOperation(e) {
    
            
        return <>
            
            <h2>factorial is </h2>
                    </>
           
    }

    myeventHandler(e) {
        // console.log(e.target);
        // console.log(e.target.value);
        // console.log("in event handler ")

        if (e.target.value == 'Factorial') {
          
            let fact=1;
            for(let i=0;i<e.target.value;i++){
                fact=fact*i;
               console.log(fact);
            }
        }




    }
    render() {
        return (
            <>

                <h1>  Enter a number</h1>
               <input
                    type="text" id="t1"
                    onBlur={(e) => { console.log(e) }}

                ></input>

                <button value="Factorial" onClick={this.myeventHandler}>
                Factorial
                </button>
                <p id="result">{}</p>
               

             {this.doOperation()}
            </>
        )

    }


}