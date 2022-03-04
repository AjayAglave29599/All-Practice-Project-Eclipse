class Person1{
    name:string;    
}
interface IEmployee1 extends Person1{
    empCode:number
}
 
let emp:IEmployee1 = {empCode:2,name:"Dr. Tarkeshwar"};
console.log(emp);