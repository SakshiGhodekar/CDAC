// 1) in http server pass data as query parameter 
//   and use that data to display on HTML Page 
//   fName=ABC&lName=XYZ

// 	o/p Hello <fName>


const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {

  const parsedUrl = url.parse(req.url, true);
  const query = parsedUrl.query;

  const fName = query.fName;

  
  res.writeHead(200, { 'Content-Type': 'text/html' });


  res.end(`<html>
    <head><title>abc</title></head>
    <body>
      <h1>Hello ${fName}</h1>
    </body>
  </html>`);
});

const port = 3000;
server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/?fName=ABC&lName=XYZ`);
});
