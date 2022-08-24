const express = require("express");
const app = express();
const port = 9090;

app.get("/", (req, res) => {
  res.send("Example running");
});
app.get("/home", (req, res) => {
  res.send("THIS IS MY HOMEEE !!!");
});

app.post("/req", (req, res) => {
  res.send("Hello this is post req");
});

app.listen(port, () => {
  console.log("Server on Express...");
});
