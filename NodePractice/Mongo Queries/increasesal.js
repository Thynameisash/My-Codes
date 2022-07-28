const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";
MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj
    .collection("employee")
    .updateMany({}, { $inc: { salary: 500 } }, (err, res) => {
      if (err) throw err;
      console.log("Increment Done");
      db.close();
    });
});
