abstract class Person{
    name: string;
    constructor(name: string){
        this.name=name;
    }   
    display(): void{ // concreate method
        console.log(this.name);
    }
    abstract find(string : string):Person;
}
class Employe11 extends Person{
    empCode: number;
    constructor(name:string, code:number){
        //this.name=name;
        super(name);
        this.empCode=code;
    }
    find(string: string): Person {
    return new Employe11(string, 1);
            //throw new Error("Method not implemented.");
    }
}
let emp : Person= new Employe11("Ajay", 111);
emp.display();
let emp2:Person =emp.find("Ajay");
console.log(emp);
console.log(emp2);


//------------------///--------------///------------//

interface IEmployee{
    empCode: number;
    empName: string
}
let emp3:Readonly<IEmployee>={
    empCode:1,empName:"Ajay"
}
let emp1:IEmployee={
    empCode:1,empName:"Ajay"
}
emp1.empCode=3;
emp1.empName="Mr. Ajay";
	
//---------///------------//----------//---------//

class Circle{
    static PI:number=3.1435633;
    static calculateArea(radius:number):number{
        return this.PI*radius*radius;
    }
}
//newCircle:Circle = new Circle();
 console.log(Circle.PI);
console.log(Circle.calculateArea(5.3345));


//---------//-------------//-------------//--------