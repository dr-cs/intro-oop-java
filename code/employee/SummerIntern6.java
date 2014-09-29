importjava.text.DateFormat;
importjava.util.Date;

publicclassSummerIntern6extendsHourlyEmployee6{

publicSummerIntern6(Stringname,DatehireDate){
this(name,hireDate,20.00,160.0);
}

publicSummerIntern6(Stringname,DatehireDate,doublehourlyWage){
this(name,hireDate,hourlyWage,160.0);
}

publicSummerIntern6(Stringname,DatehireDate,
doublehourlyWage,doublemonthlyHours){
super(name,hireDate,hourlyWage,monthlyHours);
}

publicdoublemonthlyPay(){
Datetoday=newDate();
MonththisMonth=Month.values()[today.getMonth()];
returnmonthlyPay(thisMonth);
}

publicdoublemonthlyPay(Monthmonth){
super.disallowNullArguments(month);
if(isSummer(month)){
returnsuper.monthlyPay();
}
return0.0;
}

privatebooleanisSummer(Monthmonth){
returnmonth==Month.JUN
||month==Month.JUL
||month==Month.AUG;
}

publicStringtoString(){
returnsuper.toString()+"(SummerIntern)";
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SummerIntern6fred=newSummerIntern6("Fred",
df.parse("February27,2013"),
20.00,100);

System.out.println("Thismonth'spay:"+fred.monthlyPay());
System.out.println("Maypay:"+fred.monthlyPay(Month.MAY));
System.out.println("Junepay:"+fred.monthlyPay(Month.JUN));

HourlyEmployee6barney=(HourlyEmployee6)fred;
System.out.println(barney);
}
}
