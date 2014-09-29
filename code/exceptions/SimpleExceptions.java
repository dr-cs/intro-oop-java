publicclassSimpleExceptions{

staticvoidiThrowException()throwsException{
booleanisThereAProblem=true;
//..
if(isThereAProblem){
Exceptionex=newException("ThrownfromiThrowExcepion()");
throwex;
}
System.out.println("Willthislineexecute?");
}

staticvoidfoo()throwsException{
iThrowException();
}

publicstaticvoidmain(String[]args)throwsException{
inti=0;
try{

iThrowException();
System.out.println("Willthislineexecute?");
}catch(Exceptione){
System.out.println("i=="+i);
System.out.println("CaughtExceptioninmain:"+e.getMessage());
e.printStackTrace(System.out);
}


try{
foo();
}catch(Exceptione){
System.out.println("CaughtExceptioninfoo()'scatchblock:"
+e.getMessage());
}

foo();
}
}
