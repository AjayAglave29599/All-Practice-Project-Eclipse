
let code:(string| number | boolean);
code=123;
code="ABC";
code=false;
// code= [3,4,5,5];  // not allowed to assign the numbe
//function displayType(code :(string | number | boolean))
function displayType(code :(string | number | boolean))
{
	if(typeof(code)==="number")
	{
			console.log("code is number");
	}
	else if(typeof(code)==="string")
	{
			console.log("code is string");
	}
	else if(typeof(code)==="boolean")
	{
		console.log("code is boolean");
	}
	else
	{
		console.log("somthing else");
	}
}
displayType(2);
displayType("Ajay");
displayType(true);
//displayType([1,2,3,45]);


let anyDayaType:any;
anyDayaType=32;
anyDayaType="Ajay";
anyDayaType=false;
anyDayaType=[4,5,6,3,5,5];  // List type
anyDayaType={"name":"Ajay","phone":3434,"city":"Pune"}; //JSON
anyDayaType=[[3,5,3],[6,6],[5],[6,5,6,87,6]];  // Arrays










