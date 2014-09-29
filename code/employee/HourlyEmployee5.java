importjava.util.Date;

publicclassHourlyEmployee5extendsEmployee5{

privatedoublehourlyWage;
privatedoublemonthlyHours;

/**
*ConstructsanHourlyEmployeewithhourlywageof20and
*monthlyhoursof160.
*/
publicHourlyEmployee5(StringaName,DateaHireDate){
this(aName,aHireDate,20.00,160.0);
}

publicHourlyEmployee5(StringaName,DateaHireDate,
doubleanHourlyWage,doubleaMonthlyHours){
super(aName,aHireDate);
disallowZeroesAndNegatives(anHourlyWage,aMonthlyHours);
hourlyWage=anHourlyWage;
monthlyHours=aMonthlyHours;
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
