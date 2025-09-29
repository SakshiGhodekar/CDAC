import { Component } from "react";

export default class State extends Component {
    constructor() {
        super()
        this.state = { arr: ["Pune", "Nagpur", "Mumbai", "Hyderabad"] }
    }
    getLi = () => {
        let arrayoflistitems = []
        for (var i = 0; i < this.state.arr.length; i++) {
            let jsxelement = <li>{this.state.arr[i]}</li>
            arrayoflistitems.push(jsxelement)
        }
        return arrayoflistitems

    }

    changeState(d) {
        console.log(d)

    }
    getSelectBox = () => {
      
        return this.state.arr.map
            ((sname, index) => { return <option value={index}>{sname}</option> })
    }
    render() {
        return <div style={{ margin: "10px" }} className="outline">
            <select onChange={(e) => {
                this.changeState(e.target.value);
            }}>
                {this.getSelectBox()}

            </select>

            <h1>State : {this.state.s}</h1>
        </div>
    }
}