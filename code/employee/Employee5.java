importjava.util.Calendar;
importjava.util.Date;

publicabstractclassEmployee5{

privateStringname;
privateDatehireDate;

publicEmployee5(StringaName,DateaHireDate){
disallowNullArguments(aName,aHireDate);
name=aName;
hireDate=aHireDate;
}

protectedvoiddisallowNullArguments(Object...args){
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
Employee5that=(Employee5)other;
returnname.equals(that.name)&&hireDate.equals(that.hireDate);
}

protectedvoiddisallowZeroesAndNegatives(double...args){
booleanshouldThrowException=false;
StringnonPositives="";
for(doublearg:args){
if(arg<=0.0){
shouldThrowException=true;
nonPositives+=arg+"";
}
}
if(shouldThrowException){
Stringmsg="Followingargumentswere<=0:"+nonPositives;
thrownewIllegalArgumentException(msg);
}
}
}
