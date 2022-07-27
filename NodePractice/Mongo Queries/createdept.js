const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";
MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbo = db.db(dbName);
  let data = [
    {
      deptId: 1,
      name: "Leadership",
      deptLocId: 701,
    },
    {
      deptId: 2,
      name: "Sales",
      deptLocId: 702,
    },
    {
      deptId: 3,
      name: "Marketing",
      deptLocId: 703,
    },
  ];
  data.forEach((element) => {
    dbo.collection("department").insertOne(element, (err, res) => {
      if (err) throw err;
      console.log("Data inserted!");
    });
  });
});
