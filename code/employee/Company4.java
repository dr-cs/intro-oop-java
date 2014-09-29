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

publicclassCompany4{

privateEmployee[]employees;

publicCompany4()throwsException{
DateFormatdf=DateFormat.getDateInstance();
Employee[]theEmployees={
newSalariedEmployee("AdaLovelace",
df.parse("December10,1815"),120000),
newSalariedEmployee("AlanM.Turing",
df.parse("June23,1912"),120000),
newSalariedEmployee("JohnMcCarthy",
df.parse("September4,1927"),120000),
newSalariedEmployee("JohnBackus",
df.parse("December3,1924"),120000),
newSalariedEmployee("JohnvonNeumann",
df.parse("December29,1903"),120000),
newSalariedEmployee("DonaldKnuth",
df.parse("January10,1938"),120000),
newSalariedEmployee("GuySteele",
df.parse("October2,1954"),120000),
newSalariedEmployee("RobinMilner",
df.parse("January13,1934"),120000),
newHourlyEmployee("EvaL.Uator",
df.parse("February13,2013"),20.00,200),
};
employees=theEmployees;
}

publicdoublemonthlyPayroll(){
doublepayroll=0.0;
for(Employeeemployee:employees){
payroll+=employee.monthlyPay();
}
returnpayroll;
}

publicStringtoString(){
Stringret="";
for(Employeeemployee:employees){
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
Company4c=newCompany4();
System.out.println(c);
System.out.println("Monthlypayroll:"+c.monthlyPayroll());

DateFormatdf=DateFormat.getDateInstance();
HourlyEmployee4eva=newHourlyEmployee4("EvaL.Uator",
df.parse("February13,2013"),20.00,200);
DateevaVestDate=vestDate(eva);
System.out.println(eva.getName()+"vestson"+evaVestDate);
}
}
