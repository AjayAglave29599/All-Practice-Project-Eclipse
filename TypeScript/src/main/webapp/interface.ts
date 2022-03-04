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


//-------------//-------------------//

interface KeyValueProcessor{  // functional interface   
 (key: number, value:string):void;
};
function  addKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
let myobj:KeyValueProcessor = addKeyValue;
myobj(1,"Ajay");
let myobj1:KeyValueProcessor = updateKeyValue;
myobj(2,"Aglave");


//--------------///---------------------//

interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Ajay",
                    getsalray(num):number{
                        return 100;
                    },
                    getEmpName(number):string{
                        return "Ajay";
                        }
                    };
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);


////
class Employee implements IEmployee {
    empCode: number;
    empName: string;
    constructor(empCode: number, empName: string) {
        this.empCode = empCode;
        this.empName=empName
 
    }
    getsalray(num): number {
        return 100;
    }
    getEmpName(number): string {
        return "Ajay";
    }
}

//------------//----------------//

class Student{
    private rollNumber:number;
    private stdName:string;
    constructor(enrollment:number,name:string){
        this.rollNumber=enrollment;
        this.stdName=name;
    }
    getName():string{
        return this.stdName;
    }
    getRollNumber():number{
        return this.rollNumber;
    }
}
let std:Student=new Student(1,"Ajay");
console.log(std.getName());
console.log(std.getRollNumber());



