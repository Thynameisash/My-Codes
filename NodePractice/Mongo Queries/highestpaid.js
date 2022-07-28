const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";

MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj
    .collection("employee")
    .aggregate([{ $sort: { sal: -1 } }, { $limit: 1 }])
    .toArray((err, res) => {
      if (err) throw err;
      console.log(res);
      db.close();
    });
});
