const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";

MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  dbobj
    .collection("employee")
    .aggregate([
      {
        $lookup: {
          from: "department",
          localField: "deptId",
          foreignField: "deptId",
          as: "details",
        },
      },
    ])
    .project({ empName: 1, details: 1 })
    .toArray((err, res) => {
      if (err) throw err;
      console.log(res);
    });
});
