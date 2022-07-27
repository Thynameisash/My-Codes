const { MongoClient } = require("mongodb");
const url = "mongodb://localhost:27017";
const dbName = "practice";

MongoClient.connect(url, (err, db) => {
  if (err) throw err;
  const dbobj = db.db(dbName);
  let mydata = [
    {
      empId: 690,
      empName: "Ash",
      job: "Chairman",
      managerId: 101,
      hireDate: "15/07/99",
      salary: 4200000,
      comm: 10.0,
      deptId: 1,
    },
    {
      empId: 2,
      empName: "Pikachu",
      job: "PA",
      managerId: 102,
      hireDate: "16/07/99",
      salary: 3900000,
      comm: 15.0,
      deptId: 1,
    },
    {
      empId: 3,
      empName: "Evee",
      job: "Manager",
      managerId: 103,
      hireDate: "15/12/01",
      salary: 300000,
      comm: 5.0,
      deptId: 3,
    },
    {
      empId: 4,
      empName: "Snorlax",
      job: "Quality Manager",
      managerId: 102,
      hireDate: "16/12/02",
      salary: 20000,
      comm: 20.0,
      deptId: 2,
    },
    {
      empId: 5,
      empName: "Charizard",
      job: "Fireman",
      managerId: 105,
      hireDate: "25/01/10",
      salary: 20000,
      comm: 7.0,
      deptId: 2,
    },
    {
      empId: 6,
      empName: "Bulbasaur",
      job: "Gardener",
      managerId: 104,
      hireDate: "23/10/19",
      salary: 35000,
      comm: 20.0,
      deptId: 3,
    },
    {
      empId: 7,
      empName: "Swellow",
      job: "Developer",
      managerId: 101,
      hireDate: "30/11/21",
      salary: 29000,
      comm: 25.0,
      deptId: 3,
    },
    {
      empId: 8,
      empName: "Greninja",
      job: "Analyst",
      managerId: 103,
      hireDate: "20/08/21",
      salary: 60000,
      comm: 20.0,
      deptId: 3,
    },
    {
      empId: 9,
      empName: "Sceptile",
      job: "Manager",
      managerId: 101,
      hireDate: "10/11/19",
      salary: 42000,
      comm: 10.0,
      deptId: 2,
    },
    {
      empId: 10,
      empName: "Mewtwo",
      job: "Trainer",
      managerId: 105,
      hireDate: "18/01/18",
      salary: 90000,
      comm: 10.0,
      deptId: 3,
    },
  ];
  mydata.forEach((ele) => {
    dbobj.collection("employee").insertMany(mydata, (err, res) => {
      if (err) throw err;
      console.log("Records inserted");
    });
  });
});
