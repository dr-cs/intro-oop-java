importjava.io.BufferedReader;
importjava.io.File;
importjava.io.FileNotFoundException;
importjava.io.FileReader;
importjava.io.IOException;
importjava.text.DateFormat;
importjava.text.ParseException;
importjava.util.ArrayList;
importjava.util.Date;
importjava.util.List;

publicclassCompany6{

privateEmployee6[]employees;

publicCompany6()throwsException{
DateFormatdf=DateFormat.getDateInstance();
Employee6[]theEmployees={
newSalariedEmployee6("AdaLovelace",
df.parse("December10,1815"),120000),
newSalariedEmployee6("AlanM.Turing",
df.parse("June23,1912"),120000),
newSalariedEmployee6("JohnMcCarthy",
df.parse("September4,1927"),120000),
newSalariedEmployee6("JohnBackus",
df.parse("December3,1924"),120000),
newSalariedEmployee6("JohnvonNeumann",
df.parse("December29,1903"),120000),
newSalariedEmployee6("DonaldKnuth",
df.parse("January10,1938"),120000),
newSalariedEmployee6("GuySteele",
df.parse("October2,1954"),120000),
newSalariedEmployee6("RobinMilner",
df.parse("January13,1934"),120000),
newHourlyEmployee6("EvaL.Uator",
df.parse("February13,2013"),20.00,200),
newSummerIntern6("WayneGarth",
df.parse("February25,2014"),20.00,200),
};
employees=theEmployees;
}

publicdoublemonthlyPayroll(){
Datetoday=newDate();
MonththisMonth=Month.values()[today.getMonth()];
returnmonthlyPayroll(thisMonth);
}

publicdoublemonthlyPayroll(Monthmonth){
doublepayroll=0.0;
for(Employee6employee:employees){
payroll+=employee.monthlyPay(month);
}
returnpayroll;
}

publicStringtoString(){
Stringret="";
for(Employee6employee:employees){
ret+=employee+"\n";
}
returnret;
}

publicstaticDatevestDate(Employee4employee){
DatehireDate=employee.getHireDate();
intvestYear=hireDate.getYear()+2;
returnnewDate(vestYear,hireDate.getMonth(),hireDate.getDay());
}

publicstaticvoidmain(String[]args)throwsException{
Company6c=newCompany6();
System.out.println("Monthlypayrollthismonth:"+c.monthlyPayroll());
System.out.printf("MonthlypayrollforMay:%.2f%n",
c.monthlyPayroll(Month.MAY));
System.out.printf("MonthlypayrollforJune:%.2f%n",
c.monthlyPayroll(Month.JUN));

DateFormatdf=DateFormat.getDateInstance();
HourlyEmployee4eva=newHourlyEmployee4("EvaL.Uator",
df.parse("February13,2013"),20.00,200);
DateevaVestDate=vestDate(eva);
System.out.println(eva.getName()+"vestson"+evaVestDate);
System.out.println(Month.valueOf("FEB"));
}
}
