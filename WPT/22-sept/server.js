
// 5)use http package and create server in node js 

const http=require("http");
const server=http.createServer((req,res)=>{
    res.writeHead(200,{'content-Type':'text/html'});
    res.end('hello world\n');

});
server.listen(8080);
