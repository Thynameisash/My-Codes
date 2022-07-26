const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";
MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbo = db.db(dbName);
  let data = [
    {
      id: 1,
      name: "Leadership",
      deptLocId: 101,
    },
    {
      id: 2,
      name: "Sales",
      deptLocId: 102,
    },
    {
      id: 3,
      name: "Testing",
      deptLocId: 103,
    },
  ];
  data.forEach((element) => {
    dbo.collection("department").insertOne(element, (err, res) => {
      if (err) throw err;
      console.log("Data inserted!");
    });
  });
});
