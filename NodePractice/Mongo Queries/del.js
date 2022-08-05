const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "Department";

MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj.collection("departments").deleteOne({ deptno: 3 }, (err, res) => {
    if (err) throw err;
    console.log("1 document deleted");
    db.close();
  });
});
