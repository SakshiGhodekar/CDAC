import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Custom from './custom';
import MyFunction from './myFunction';
import { Function2, Function3 } from './myFunction';
import reportWebVitals from './reportWebVitals';
import Factorial from './Factorial';
import ParentComponent from './ParentComponent';
import ChildComponent from './ChildComponent';
import view from './view';
import TextTransformer from './TextTransformer';
import undergraduate from' ./undergraduate';

const root = ReactDOM.createRoot
  (document.getElementById('root'));

root.render(
  <>

    {/* <App></App> */}
    {/* <Factorial num1={12}></Factorial> */}
  {/* <TextTransformer></TextTransformer> */}
  <undergraduate></undergraduate>
  </>
);
reportWebVitals();
