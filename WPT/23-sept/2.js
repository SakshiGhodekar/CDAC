// 2) create array like todo as shown in lecture  say todos
  
// 	display array data depends on path param 

// 	<url>/todos  --  display data in json format 

// 	<url>/todos/<id> -- display specific id data on web page 



const http = require('http');
const url = require('url');

const todos = [
  { id: 1, task: "sakshi", completed: false },
  { id: 2, task: " cdac ", completed: true },
  { id: 3, task: "book", completed: false }
];

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const path = parsedUrl.pathname;
  const pathParts = path.split('/').filter(Boolean); 

  if (path === '/todos') {
   
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(todos));
  } else if (pathParts[0] === 'todos' && pathParts.length === 2) {
   
    const id = parseInt(pathParts[1]);
    const todo = todos.find(t => t.id === id);

    if (todo) {
      
      res.writeHead(200, { 'Content-Type': 'text/html' });
      res.end(`
        <html>
          <head><title>Todo ${todo.id}</title></head>
          <body>
            <h1>Todo #${todo.id}</h1>
            <p><strong>Task:</strong> ${todo.task}</p>
            <p><strong>Completed:</strong> ${todo.completed}</p>
          </body>
        </html>
      `);
    } else {
      
      res.writeHead(404, { 'Content-Type': 'text/plain' });
      res.end('Todo not found');
    }
  } else {
   
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Route not found');
  }
});

const port=8080;
server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
