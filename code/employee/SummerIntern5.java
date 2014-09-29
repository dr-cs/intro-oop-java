importjava.text.DateFormat;
importjava.util.Date;

publicclassSummerIntern5extendsHourlyEmployee5{

publicSummerIntern5(Stringname,DatehireDate){
this(name,hireDate,20.00,160.0);
}

publicSummerIntern5(Stringname,DatehireDate,doublehourlyWage){
this(name,hireDate,hourlyWage,160.0);
}

publicSummerIntern5(Stringname,DatehireDate,
doublehourlyWage,doublemonthlyHours){
super(name,hireDate,hourlyWage,monthlyHours);
}

publicdoublemonthlyPay(Monthmonth){
super.disallowNullArguments(month);
if(isSummer(month)){
return0.0;//super.monthlyPay(month);
}
return0.0;
}

privatebooleanisSummer(Monthmonth){
System.out.println("InSummerIntern.isSummer(),month="+month);
returnmonth==Month.JUN
||month==Month.JUL
||month==Month.AUG;
}

publicStringtoString(){
returnsuper.toString()+"(SummerIntern)";
}

publicstaticvoidmain(String[]args)throwsException{
DateFormatdf=DateFormat.getDateInstance();
SummerIntern5fred=newSummerIntern5("Fred",
df.parse("February27,2013"),
20.00,100);

System.out.println("Rightnowpay:"+((Employee5)fred).monthlyPay());
System.out.println("Maypay:"+fred.monthlyPay(Month.MAY));
System.out.println("Junepay:"+fred.monthlyPay(Month.JUN));

HourlyEmployee5barney=(HourlyEmployee5)fred;
System.out.println(barney);
}
}
