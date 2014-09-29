importjava.util.Calendar;
importjava.util.Date;

publicabstractclassEmployee{

privateStringname;
privateDatehireDate;

publicEmployee(StringaName,DateaHireDate){
ValidationUtils.disallowNullArguments(aName,aHireDate);
name=aName;
hireDate=aHireDate;
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

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofEmployee))returnfalse;
Employeethat=(Employee)other;
returnname.equals(that.name)&&hireDate.equals(that.hireDate);
}
}
