var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
    }
    return Person;
}());
var CompanyEmployee = /** @class */ (function (_super) {
    __extends(CompanyEmployee, _super);
    function CompanyEmployee(code, empName) {
        var _this = _super.call(this, empName) || this;
        _this.empCode = code;
        return _this;
    }
    CompanyEmployee.prototype.displayName = function () {
        console.log(this.empCode + ", " + this.name);
    };
    return CompanyEmployee;
}(Person));
var newObj = new CompanyEmployee(1, "Ajay");
newObj.displayName();
