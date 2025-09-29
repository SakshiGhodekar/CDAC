// ) use middleware app.use and check   
//       set data in request object and  display that data in next method
const express = require('express');
const app = express();
const port = 3000;

const mid = (req, res, next) => {
    console.log('Middleware is running...');
    req.customData = {
        message: 'This data was set by the middleware.',
        timestamp: new Date().toISOString()
    };

    next();
};
app.use(mid);
app.get('/', (req, res) => {
    
    const data = req.customData;
    console.log('Route handler is running...');

    
    res.json({
        status: 'success',
        receivedData: data
    });
});
app.listen(port)