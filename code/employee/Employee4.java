importjava.util.Calendar;
importjava.util.Date;

publicabstractclassEmployee4{

privateStringname;
privateDatehireDate;

publicEmployee4(StringaName,DateaHireDate){
disallowNullArguments(aName,aHireDate);
name=aName;
hireDate=aHireDate;
}

privatevoiddisallowNullArguments(Object...args){
booleanshouldThrowException=false;
for(Objectarg:args){
if(arg==null){
shouldThrowException=true;
}
}
if(shouldThrowException){
Stringmsg="nullargumentsnotallowed.";
thrownewIllegalArgumentException(msg);
}
}

publicabstractdoublemonthlyPay();

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

//--------------------------------------------------------

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofEmployee))returnfalse;
Employee4that=(Employee4)other;
returnname.equals(that.name)&&hireDate.equals(that.hireDate);
}
}
