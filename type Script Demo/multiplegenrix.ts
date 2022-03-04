function displayType<T, U>(id:T, name:U):void{
    console.log(typeof(id)+", "+typeof(name));
}
displayType<number, string>(1,"Ajay");
displayType<string, number>("Mr. Ajay A",2);
 
function displayType1<T>(id:T, name:any):void{
    console.log(typeof(id)+", "+typeof(name));
}
displayType1<boolean>(true,"Ajay");
displayType1<string[]>(["Mr.Ajay", "Aglave"],2);

//-------------------//---------------//-------------------------//

function displayType2<T, U>(id:T, name:U):void{
    id.toString();
    name.toString();
    //id.toFixed();  // No gaurentee to be a number
    //name.toUpperCase(); // No gaurentee to be a string
    console.log(typeof(id)+", "+typeof(name));
}
displayType2<string, number>("Mr.Ajay",5);
displayType2<number,string>(2,"Mr.Ajay");
displayType2<boolean,string>(true,"Mr.Ajay");
displayType2<string[],number>(["Mr.Ajay", "Ajay"],2);

//--------//--------------------------//---------//------------//