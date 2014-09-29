importjava.util.Date;

publicclassHourlyEmployee2extendsEmployee2{

privatedoublehourlyWage;
privatedoublemonthlyHours;

publicHourlyEmployee2(StringaName,DateaHireDate,
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
