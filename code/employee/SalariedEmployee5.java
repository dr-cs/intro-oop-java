importjava.text.DateFormat;
importjava.util.Calendar;
importjava.util.Date;

publicclassSalariedEmployee5extendsEmployee5{

privatestaticfinalintMONTHS_PER_YEAR=12;

privatefinaldoubleannualSalary;

publicSalariedEmployee5(StringaName,DateaHireDate,
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

publicStringtoString(){
returnsuper.toString()+";AnnualSalary:"+annualSalary;
}

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofSalariedEmployee3))returnfalse;
SalariedEmployee5that=(SalariedEmployee5)other;
returnsuper.equals(that)&&(this.annualSalary==that.annualSalary);
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SalariedEmployee5eva=newSalariedEmployee5("EvaLuator",
df.parse("June10,2013"),
1000000);
System.out.println(eva.getName());
}
}
