importjava.util.Calendar;
importjava.util.Date;

publicclassHourlyEmployeeextendsEmployee{

privatefinaldoublehourlyWage;
privatefinaldoublemonthlyHours;

publicHourlyEmployee(HourlyEmployeeother){
super(other);
this.hourlyWage=other.hourlyWage;
this.monthlyHours=other.monthlyHours;
}

publicHourlyEmployee(StringaName){
this(aName,newDate(),20.00,160.0);
}

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
disallowZeroesAndNegatives(anHourlyWage,aMonthlyHours);
hourlyWage=anHourlyWage;
monthlyHours=aMonthlyHours;
}

publicdoublegetHourlyWage(){
returnhourlyWage;
}

publicdoublegetMonthlyHours(){
returnmonthlyHours;
}

publicdoublemonthlyPay(Calendarcal){
returnhourlyWage*monthlyHours;
}

publicStringtoString(){
returngetName()+";HireDate:"+getHireDate()+";HourlyWage:"
+hourlyWage+";MonthlyHours:"+monthlyHours;
}
}
