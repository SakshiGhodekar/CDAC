
const express = require('express');
const users1 = require('./MOCK_DATA.json');
const usersByMail=require('./MOCK_DATA.json');
const userByName =require('./MOCK_DATA.json');
const port = 4000;

const app = express();

app.get('/', (req, res) => {
    res.send("Hello From Express");
});

app.get('/users1', (req, res) => {

    res.json(users1);
});

app.get('/users1/:id/', (req, res) => {
    const id = Number(req.params.id); 
  
    const user = users1.find(
        user => user.id === id
    )
    return res.json(user);
});
app.get('/usersByMail/:email', (req, res) => {
    const email=req.params.email;
    const user=usersByMail.find(
    user=>user.email===email
)
    return res.json(user)
});
app.get('/userByName/:first_name', (req, res) => {
    const name=req.params.first_name;
    const user=userByName.find(
        user=>user.first_name===name
    )
   return res.json(user)
});

app.delete('/users1/:id', (req, res) => {
    const id = Number(req.params.id);  
  
    const user = users1.find(
        user => user.id === id
    )

    return res.json(user);
});

app.listen(port); 
console.log("From Start Script ");