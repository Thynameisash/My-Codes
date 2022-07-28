const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";
MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj
    .collection("employee")
    .aggregate([{ $sort: { _id: -1 } }, { $limit: 8 }, { $out: "employee" }])
    .toArray((err, res) => {
      if (err) throw err;
      console.log("Last 2 employees deleted !");
      db.close();
    });
});
