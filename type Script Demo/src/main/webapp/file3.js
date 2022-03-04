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
    function toUppercase(name) {
        return name.toUpperCase();
    }
    function subString(str, from, to) {
        return str.substring(from, to);
    }
})(StringUtility || (StringUtility = {}));
