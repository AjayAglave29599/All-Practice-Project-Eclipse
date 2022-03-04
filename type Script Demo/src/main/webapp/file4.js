var StringUtility;
(function (StringUtility) {
    var Employee = /** @class */ (function () {
        function Employee(name) {
            this.myName = name;
        }
        Employee.prototype.greet = function (name) {
            return "Good Evening!" + name;
        };
        return Employee;
    }());
    StringUtility.Employee = Employee;
    function toUppercase(name) {
        return name.toUpperCase();
    }
    StringUtility.toUppercase = toUppercase;
    function subString(str, from, to) {
        return str.substring(from, to);
    }
    StringUtility.subString = subString;
})(StringUtility || (StringUtility = {}));
