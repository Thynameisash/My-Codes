const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "Department";
MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj
    .collection("departments")
    .updateOne({ deptno: 1 }, { $set: { address: "USA" } }, (err, res) => {
      if (err) throw err;
      console.log("Value Changed");
      db.close();
    });
});
