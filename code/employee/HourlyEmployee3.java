importjava.util.Date;

publicclassHourlyEmployee3extendsEmployee3{

privatedoublehourlyWage;
privatedoublemonthlyHours;

/**
*ConstructsanHourlyEmployeewithhourlywageof20and
*monthlyhoursof160.
*/
publicHourlyEmployee3(StringaName,DateaHireDate){
this(aName,aHireDate,20.00,160.0);
}

publicHourlyEmployee3(StringaName,DateaHireDate,
doubleanHourlyWage,doubleaMonthlyHours){
super(aName,aHireDate);
disallowZeroesAndNegatives(anHourlyWage,aMonthlyHours);
hourlyWage=anHourlyWage;
monthlyHours=aMonthlyHours;
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
return"Hourly:"+super.getName();
}

publicdoublegetHourlyWage(){
returnhourlyWage;
}

publicvoidsetHourlyWage(doublenewWage){
hourlyWage=newWage;
}

publicdoublegetMonthlyHours(){
returnmonthlyHours;
}

publicdoublemonthlyPay(){
returnhourlyWage*monthlyHours;
}

publicStringtoString(){
returngetName()+";HireDate:"+getHireDate()+";HourlyWage:"
+hourlyWage+";MonthlyHours:"+monthlyHours;
}
}
