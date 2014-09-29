importjava.text.DateFormat;
importjava.util.Calendar;
importjava.util.Date;

publicclassSalariedEmployee6extendsEmployee6{

privatestaticfinalintMONTHS_PER_YEAR=12;

privatefinaldoubleannualSalary;

publicSalariedEmployee6(StringaName,DateaHireDate,
doubleanAnnualSalary){
super(aName,aHireDate);
disallowZeroesAndNegatives(anAnnualSalary);
annualSalary=anAnnualSalary;
}

@Override
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

@Override
publicdoublemonthlyPay(Monthmonth){
returnmonthlyPay();
}

publicStringtoString(){
returnsuper.toString()+";AnnualSalary:"+annualSalary;
}

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofSalariedEmployee3))returnfalse;
SalariedEmployee6that=(SalariedEmployee6)other;
returnsuper.equals(that)&&(this.annualSalary==that.annualSalary);
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SalariedEmployee6eva=newSalariedEmployee6("EvaLuator",
df.parse("June10,2013"),
1000000);
System.out.println(eva.getName());
}
}
