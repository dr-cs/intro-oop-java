packageedu.gatech.cs1331.companygui;

importjava.util.Calendar;
importjava.util.Date;

publicfinalclassSalariedEmployeeextendsEmployee{

privatestaticfinalintMONTHS_PER_YEAR=12;

privatefinaldoubleannualSalary;

publicSalariedEmployee(SalariedEmployeeother){
super(other);
this.annualSalary=other.annualSalary;
}

publicSalariedEmployee(StringaName){
this(aName,newDate(),60000);
}


publicSalariedEmployee(StringaName,DateaHireDate,
doubleanAnnualSalary){
super(aName,aHireDate);
disallowZeroesAndNegatives(anAnnualSalary);
annualSalary=anAnnualSalary;
}

publicdoublegetAnnualSalary(){
returnannualSalary;
}

publicdoublemonthlyPay(Calendarcal){
returnannualSalary/MONTHS_PER_YEAR;
}

publicStringtoString(){
returnsuper.toString()+";AnnualSalary:"+annualSalary;
}

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofSalariedEmployee))returnfalse;
SalariedEmployeethat=(SalariedEmployee)other;
returnsuper.equals(that)&&(this.annualSalary==that.annualSalary);
}
}
