importjava.text.DateFormat;
importjava.util.Calendar;
importjava.util.Date;

publicclassSalariedEmployee3extendsEmployee3{

privatestaticfinalintMONTHS_PER_YEAR=12;

privatefinaldoubleannualSalary;

publicSalariedEmployee3(StringaName,DateaHireDate,
doubleanAnnualSalary){
super(aName,aHireDate);
disallowZeroesAndNegatives(anAnnualSalary);
annualSalary=anAnnualSalary;
}

privatevoiddisallowZeroesAndNegatives(double...args){
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

publicStringgetName(){
return"Salaried:"+super.getName();
}

publicdoublegetAnnualSalary(){
returnannualSalary;
}

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
SalariedEmployee3that=(SalariedEmployee3)other;
returnsuper.equals(that)&&(this.annualSalary==that.annualSalary);
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SalariedEmployee3eva=newSalariedEmployee3("EvaLuator",
df.parse("June10,2013"),
1000000);
System.out.println(eva.getName());
}
}
