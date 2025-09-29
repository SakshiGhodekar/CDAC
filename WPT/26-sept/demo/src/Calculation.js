
export default function Calulator(props) {

    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);

    function Addition() {
        return (n1 + n2);
    }
    function Substraction(){
        return (n1-n2);
    }
    function Multiplication(){
        return(n1*n2)
    }
    function Division(){
        return (n1/n2)
    }
    return (
        <>
            <p>Calculator </p>
            <h2>Addition  : {Addition()} </h2>
            <h2>Multiplication: {Multiplication()} </h2>
            <h2>Substraction :{Substraction()} </h2>
            <h2>Division :{Division()} </h2>
             {/* <input type='text'>Enter first no</input>
      <button onClick={Addition}>Addition</button>
      <button onClick={Substraction}>Substraction</button>
      <button onClick={Multiplication}>Multiplication</button>
      <button onClick={Division}>Division</button> */}
        </>
    )
}