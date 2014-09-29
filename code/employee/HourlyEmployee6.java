importjava.util.Date;

publicclassHourlyEmployee6extendsEmployee6{

privatedoublehourlyWage;
privatedoublemonthlyHours;

/**
*ConstructsanHourlyEmployeewithhourlywageof20and
*monthlyhoursof160.
*/
publicHourlyEmployee6(StringaName,DateaHireDate){
this(aName,aHireDate,20.00,160.0);
}

publicHourlyEmployee6(StringaName,DateaHireDate,
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

@Override
publicdoublemonthlyPay(){
returnhourlyWage*monthlyHours;
}

@Override
publicdoublemonthlyPay(Monthmonth){
returnmonthlyPay();
}

publicStringtoString(){
returngetName()+";HireDate:"+getHireDate()+";HourlyWage:"
+hourlyWage+";MonthlyHours:"+monthlyHours;
}
}
