importjava.text.DateFormat;
importjava.text.ParseException;
importjava.util.Date;

publicclassHourlyEmployeeextendsEmployee{

publicstaticStringYAY="yay!";

privatedoublehourlyWage;
privatedoublemonthlyHours;

/**
*ConstructsanHourlyEmployeewithhourlywageof20and
*monthlyhoursof160.
*/
publicHourlyEmployee(StringaName,DateaHireDate){
this(aName,aHireDate,20.00,160.0);
}

publicHourlyEmployee(StringaName,DateaHireDate,
doubleanHourlyWage,doubleaMonthlyHours){
super(aName,aHireDate);
ValidationUtils..disallowZeroesAndNegatives(anHourlyWage,
aMonthlyHours);
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


publicstaticvoidmain(String[]args)throwsException{
System.out.println(YAY);
DateFormatdf=DateFormat.getDateInstance();
HourlyEmployeeeva=newHourlyEmployee("EvaLuator",
df.parse("June10,2013"));

System.out.println("eva'sname:"+eva.getName());

}
}
