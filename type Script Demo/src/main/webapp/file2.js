"use strict";
exports.__esModule = true;
var file1_1 = require("./file1");
var file1_2 = require("./file1");
//import {companyName} from "./variables_export";  //( can't import without export assignment to the variable or class)
console.log(file1_1.age);
var emp = new file1_2.Employee("Mr. Ajay Aglave", 2);
console.log(emp.displayEmployee());
