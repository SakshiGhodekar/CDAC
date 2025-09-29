const h =require("http")
const s=h.createServer(function(req,res){
    console.log(req.headers)
    console.log(req.url)
    res.write("<h1>hello from server</h1>");
    res.end();
})
s.listen(8080)
