const http = require("http");

const port = 8080;

const server = http.createServer((req, res) => {
  if (req.url == "/") {
    res.statusCode = 200;
    res.end("OKAYYYYY HI HELLOOO");
  }
});

server.listen(port, () => {
  console.log("Listening......");
});

module.exports = server;
