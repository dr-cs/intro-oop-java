importjava.text.DateFormat;
importjava.util.Calendar;
importjava.util.Date;

publicclassSummerInternextendsHourlyEmployee{

publicSummerIntern(Stringname,DatehireDate){
this(name,hireDate,20.00,160.0);
}

publicSummerIntern(Stringname,DatehireDate,doublehourlyWage){
this(name,hireDate,hourlyWage,160.0);
}

publicSummerIntern(Stringname,DatehireDate,
doublehourlyWage,doublemonthlyHours){
super(name,hireDate,hourlyWage,monthlyHours);
}

publicdoublemonthlyPay(Calendarmonth){
//Isthisclear?Couldyourewritethistobeclearer?
returnisSummer(month)?super.monthlyPay(month):0.0;
}

publicStringtoString(){
returnsuper.toString()+"(SummerIntern)";
}

privatebooleanisSummer(Calendarcalendar){
intmonth=calendar.get(Calendar.MONTH);
System.out.println("InSummerIntern.isSummer(),month="+month);
returnmonth==Calendar.JUNE
||month==Calendar.JULY
||month==Calendar.AUGUST;
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SummerInternfred=newSummerIntern("Fred",
df.parse("February27,2013"),
20.00,100);
Calendarmay=Calendar.getInstance();
may.set(Calendar.MONTH,Calendar.MAY);
Calendarjune=Calendar.getInstance();
june.set(Calendar.MONTH,Calendar.JUNE);
System.out.println("Maypay:"+fred.monthlyPay(may));
System.out.println("Junepay:"+fred.monthlyPay(june));

HourlyEmployeebarney=(HourlyEmployee)fred;
System.out.println(barney);
}
}
