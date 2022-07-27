const fs = require("fs");

fs.readFile("./file1.txt", (err, data1) => {
  if (err) throw err;
  fs.readFile("./file2.txt", (err, data2) => {
    if (err) throw err;
    fs.appendFile("./file3.txt", data1 + data2, (err) => {
      if (err) throw err;
      console.log("Data Appended");
    });
  });
});
