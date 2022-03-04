import {age} from "./file1";
import {Employee} from "./file1";
//import {companyName} from "./variables_export";  //( can't import without export assignment to the variable or class)
console.log(age);
let emp:Employee= new Employee("Mr. Ajay Aglave", 2);
console.log(emp.displayEmployee());