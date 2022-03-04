"use strict";
exports.__esModule = true;
exports.Employee = exports.age = void 0;
exports.age = 20;
var Employee = /** @class */ (function () {
    function Employee(name, code) {
        this.empCode = code;
        this.empName = name;
    }
    Employee.prototype.displayEmployee = function () {
        console.log(this.empCode + ", " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;
var companyName = "XYZ corporation"; // can't be export with export keyword'
