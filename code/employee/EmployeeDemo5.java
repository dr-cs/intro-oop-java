importjava.text.DateFormat;
importjava.text.ParseException;
importjava.util.Date;

publicclassEmployeeDemo5{

/**
*DemonstratestheuseofEmployeeandsublclassesthereof.
*
*@throwsjava.text.ParseExceptionifthedateStringsupplied
*toDateFormat.parseisnotproperlyformatted.
*/
publicstaticvoidmain(String[]args)throwsParseException{
DateFormatdf=DateFormat.getDateInstance();
HourlyEmployee5eva=newHourlyEmployee5("EvaL.Uator",
df.parse("February18,2013"),
20.00,160);
System.out.println(eva.getName()+"washiredon"+eva.getHireDate());
}
}
