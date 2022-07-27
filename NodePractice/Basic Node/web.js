var http = require("http");

var server = http.createServer(function (req, res) {
  console.log("server started");
  console.log(req.url);
  if (req.url === "/home") {
    res.writeHead(200);
    res.end(`<html><body><h1>Home Page</h1></body></html>`);
  } else if (req.url === "/employee") {
    res.writeHead(200);
    res.end(`<html><body><h1>Employee Page</h1></body></html>`);
  } else if (req.url === "/department") {
    res.writeHead(200);
    res.end(`<html><body><h1>Department Page</h1></body></html>`);
  } else {
    res.writeHead(200);
    res.end(`<html><body><h1>Invalid URL</h1></body></html>`);
  }
});

server.listen(5000);
