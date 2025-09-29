import React, { useState } from 'react';
import { Component } from "react";

function undergraduate(){
    return (
        <div>
            <h2></h2>
            <input type="text"
            value={inputText}
            onChange={(e) => setInputText(e.target.value)} 
            placeholder="Enter name here"
             style={{ padding: '8px', width: '300px', marginBottom: '15px' }}
             ></input>

            <input type="email"
            value={Email}
            onChange={(e) =>setEmailText(e.target.value)}
            placeholder="Enter mail here"
            style={{padding :'8 px',width:'300 px',marginBottom:'15px'}}
            ></input> 

            <option>
                <select>undergraduate</select>
                <select>postgraduate</select>
                <select>graduate</select>
            </option>
             
        </div>
    )
}

export default undergraduate;