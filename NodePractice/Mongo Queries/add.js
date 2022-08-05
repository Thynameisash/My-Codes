const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "Department";

MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbo = db.db(dbName);
  let data = [
    {
      deptno: 1,
      dname: "Leadership",
      address: "New Delhi",
    },
    {
      deptno: 2,
      dname: "Sales",
      address: "Bangalore",
    },
    {
      deptno: 3,
      dname: "Marketing",
      address: "Noida",
    },
  ];

  dbo.collection("departments").insertMany(data, (err, res) => {
    if (err) throw err;
    console.log("Data inserted!");
  });
});
