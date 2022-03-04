/**
 * 
 */
 function myfunction()
 {
	var name="Mr Ajay Aglave";
	function printName()
	{
		alert("Myname is: "+name);
		console.log("Myname is: "+name);
	}
	printName();
}
myfunction();

function addition(a)
{
	return function(y)
	{
		return a+y;
		
	};
	
}
var first=addition(10);
var second =addition(20);

console.log("10+20 ="+first(20));
console.log("20+10 ="+second(10));