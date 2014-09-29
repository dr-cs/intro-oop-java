packageedu.gatech.cs1331.companygui;

importjava.util.Calendar;
importjava.util.Date;

publicabstractclassEmployee{

privateStringname;
privateDatehireDate;

publicEmployee(Employeeother){
this.name=other.name;
this.hireDate=other.hireDate;
}

publicEmployee(StringaName,DateaHireDate){
disallowNullArguments(aName,aHireDate);
name=aName;
hireDate=aHireDate;
}

publicdoublemonthlyPay(){
CalendarrightNow=Calendar.getInstance();
returnmonthlyPay(rightNow);
}

publicabstractdoublemonthlyPay(Calendarcalendar);

publicStringgetName(){
returnname;
}

publicDategetHireDate(){
returnhireDate;
}

publicStringtoString(){
returnname+";"+hireDate;
}

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofEmployee))returnfalse;
Employeethat=(Employee)other;
returnname.equals(that.name)&&hireDate.equals(that.hireDate);
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
