importjava.util.Date;

publicclassEmployee1{

privateStringname;
privateDatehireDate;

publicEmployee1(StringaName,DateaHireDate){
disallowNullArguments(aName,aHireDate);
name=aName;
hireDate=aHireDate;
}

publicStringgetName(){
returnname;
}

publicDategetHireDate(){
returnhireDate;
}

publicStringtoString(){
returnname+";"+hireDate;
}

privatevoiddisallowNullArguments(Object...args){
booleanshouldThrowException=false;
StringnullArgs="";
for(Objectarg:args){
if(arg==null){
shouldThrowException=true;
nullArgs+=arg+"";
}
}
if(shouldThrowException){
Stringmsg="nullargumentsnotallowed.";
thrownewIllegalArgumentException(msg);
}
}
}
