importjava.text.DateFormat;
importjava.util.Calendar;
importjava.util.Date;

publicclassSalariedEmployeeextendsEmployee{

privatestaticfinalintMONTHS_PER_YEAR=12;

privatefinaldoubleannualSalary;

publicSalariedEmployee(StringaName,DateaHireDate,
doubleanAnnualSalary){
super(aName,aHireDate);
disallowZeroesAndNegatives(anAnnualSalary);
annualSalary=anAnnualSalary;
}

publicStringgetName(){
return"Salaried:"+super.getName();
}

publicdoublegetAnnualSalary(){
returnannualSalary;
}

@Override
publicdoublemonthlyPay(){
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

publicstaticvoidmain(String[]args)throwsException{
System.out.println(HourlyEmployee.YAY);
DateFormatdf=DateFormat.getDateInstance();
SalariedEmployeeeva=newSalariedEmployee("EvaLuator",
df.parse("June10,2013"),
1000000);
System.out.println(eva.getName());
}
}
