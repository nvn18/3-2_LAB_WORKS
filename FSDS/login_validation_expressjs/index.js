const express = require('express');
const bodyParser = require('body-parser');

const app=express();
const port=3000;

app.use(bodyParser.urlencoded({extended:true}));
app.use(express.static('public'));  

app.post('/login', (req, res) => {
    const { username, password } = req.body;
    if (username === 'neeraj' && password === 'emma') {
        res.send('Login successful!');
      } else {
        res.status(401).send('Invalid username or password');
      }
    });
    app.listen(port, () => {
        console.log(`Server listening at http://localhost:${port}`);
      });