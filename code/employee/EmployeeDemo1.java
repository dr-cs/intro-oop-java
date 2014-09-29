importjava.text.DateFormat;
importjava.text.ParseException;

publicclassEmployeeDemo1{

/**
*DemonstratestheuseofEmployeeandsublclassesthereof.
*
*@throwsjava.text.ParseExceptionifthedateStringsupplied
*toDateFormat.parseisnotproperlyformatted.
*/
publicstaticvoidmain(String[]args)throwsParseException{
DateFormatdf=DateFormat.getDateInstance();
HourlyEmployeeeva=newHourlyEmployee("EvaL.Uator",
df.parse("February18,2013"),
-20.00,160);
System.out.println(eva.getName()+"washiredon"+eva.getHireDate());
}
}
