import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Custom from './custom';
import Calculation from './Calculation';
// import { Function2, Function3 } from './myFunction';
import reportWebVitals from './reportWebVitals';
import Factorial from './Factorial';
import Lower from './Lower';

const root = ReactDOM.createRoot
  (document.getElementById('root'));

root.render(
  <>
    {/* <Factorial num1="5"num2="12"></Factorial>
    <Calculation num1="10" num2="10"></Calculation> */}
    <Lower></Lower>
  </>

);
reportWebVitals();
