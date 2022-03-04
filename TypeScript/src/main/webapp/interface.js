/*interface IEmployee{
       empCode:number;
       empName:string;
         //salray:(number) => number;
        getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Ajay",
                    getEmpName(number):string{return "Ajay";}};
console.log(obj.getEmpName);
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);*/
;
function addKeyValue(key, value) {
    console.log(key + ", " + value);
}
function updateKeyValue(key, value) {
    console.log(key + ", " + value);
}
var myobj = addKeyValue;
myobj(1, "Ajay");
var myobj1 = updateKeyValue;
myobj(2, "Aglave");
var obj = { empCode: 1,
    empName: "Ajay", getsalray: function (num) {
        return 100;
    }, getEmpName: function (number) {
        return "Ajay";
    }
};
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
////
var Employee = /** @class */ (function () {
    function Employee(empCode, empName) {
        this.empCode = empCode;
        this.empName = empName;
    }
    Employee.prototype.getsalray = function (num) {
        return 100;
    };
    Employee.prototype.getEmpName = function (number) {
        return "Ajay";
    };
    return Employee;
}());
//------------//----------------//
var Student = /** @class */ (function () {
    function Student(enrollment, name) {
        this.rollNumber = enrollment;
        this.stdName = name;
    }
    Student.prototype.getName = function () {
        return this.stdName;
    };
    Student.prototype.getRollNumber = function () {
        return this.rollNumber;
    };
    return Student;
}());
var std = new Student(1, "Ajay");
console.log(std.getName());
console.log(std.getRollNumber());
