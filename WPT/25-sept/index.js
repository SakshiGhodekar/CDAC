const express = require('express');
const f = require('fs');
const p = require('path');
const users1 = require('./MOCK_DATA.json');
const port = 3030;
const app = express();
app.get('/', (req, res) => {
    res.send("Hello From Express");
});

app.get('/users', (req, res) => {
  
    res.json(users1);
});
app.get('/users/:id ', (req, res) => {
    const id = Number(req.params.id); 

    const user = users1.find(
        user => user.id === id
    )

    return res.json(user);
});

app.get('/users/:id/:email ', (req, res) => {
    const id = Number(req.params.id); 
   
    const user = users1.find(
        user => user.id === id
    )
   
    return res.json(user);
});

app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  // 15
    
    const userIndex = users1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = users1.splice(userIndex, 1);
    return res.json("Dae ");
});

app.use(express.urlencoded({ extended: false }))

app.post('/adduser', (req, res) => {
    const data = req.body;
    console.log("data " + data.email);
    users1.push(
        { data, id: users1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(users1), (err) => {
            console.log(err)
        });

    return res.json("data added ");

})
app.put('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const updatedUserData = req.body;
    const userIndex = users1.findIndex(user => user.id === id);
    fs.writeFile('./MOCK_DATA.json', JSON.stringify(users1, null, 2), (err) => {
        if (err) {
            console.error(err);
            return res.status(500).json({ status: "Error", message: "Failed to update user data." });
        }
        return res.json({ status: "Success", message: "User updated successfully.", updatedUser: users1[userIndex] });
    });
});
app.get('/aboutus', (req, res) => {
    const t = p.join(__dirname, "./uboutus.html");
    console.log(t);
    res.sendFile(t);
});
app.listen(port)
console.log("From Start Script ");