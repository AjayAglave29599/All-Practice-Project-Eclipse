namespace StringUtility{
    class Employee{
        myName:string;
        greet(name :string ):string{
            return "Good Evening!"+name;
        }   
        constructor(name:string){
            this.myName=name;
        }
    }
    function toUppercase(name:string):string{
        return name.toUpperCase();
    }
    function subString(str:string, from:number, to:number):string{
        return str.substring(from,to);
    }
}