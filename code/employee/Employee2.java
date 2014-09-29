importjava.util.Date;

publicclassEmployee2{

privateStringname;
privateDatehireDate;

publicEmployee2(StringaName,DateaHireDate){
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

@Override
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
