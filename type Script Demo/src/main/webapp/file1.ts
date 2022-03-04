export let age:number =20;
export class Employee{
    empCode:number;
    empName:string;
    constructor(name:string, code:number){
        this.empCode=code;
        this.empName=name;
    }
    displayEmployee():void{
        console.log(this.empCode+", "+this.empName);
    }
}
let companyName:string="XYZ corporation"; // can't be export with export keyword'