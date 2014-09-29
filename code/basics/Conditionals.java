importjava.util.Scanner;

publicclassConditionals{

publicstaticvoidmain(String[]args){
System.out.print("Enteraninteger:");
Scannerkeyboard=newScanner(System.in);
intnum=keyboard.nextInt();

if((num%2)==0)
System.out.printf("%diseven.%n",num);
else
System.out.printf("%disodd.%n",num);

//Booleanexpressions
booleannumIsEven=(num%2)==0;

//Noticetheuseof{}evenforsinglestatements-
//-goodideaalwaystouse{}
if(numIsEven){
System.out.println("Ilikeevennumbers.");
}else{
System.out.println("I'mambivalentaboutoddnumbers.");
}

//Theif-elsestatementsabovecanbecombinedusingblocks
if(numIsEven){
System.out.printf("%diseven.%n",num);
System.out.println("Ilikeevennumbers.");
}else{
System.out.printf("%disodd.%n",num);
System.out.println("I'mambivalentaboutoddnumbers.");
}

//Bewarethatassignmentisactuallyanexpression.
//Anassignmenthasthevalueoftheassignment.
//Thisiswhychainedassignmentswork.
System.out.println("\n*************CAUTION!*************");
if(numIsEven=true){
System.out.println("Thisstatementwillalwaysexecute.");
}else{
System.out.println("Thisstatementwillneverexecute.");
}

System.out.println();
}
}
