packageedu.gatech.cs1331.companygui;

importjava.io.BufferedReader;
importjava.io.File;
importjava.io.FileReader;
importjava.io.FileNotFoundException;
importjava.io.IOException;
importjava.text.DateFormat;
importjava.text.ParseException;
importjava.util.ArrayList;
importjava.util.Calendar;
importjava.util.Date;

publicclassCompany{

privateArrayList<Employee>employees;

publicCompany(StringemployeeDataFile){
this(newFile(employeeDataFile));
}

publicCompany(FiledataFile){
employees=newArrayList<Employee>(10);
try{
initFromFile(dataFile);
}catch(FileNotFoundExceptione){
System.out.println("Can'trunwithoutanemployeedatafile.");
System.out.println(e.getMessage());
System.exit(0);
}catch(ParseExceptione){
Stringmsg="Malformeddatacausedexception:"+e.getMessage();
System.out.println(msg);
System.out.println("Fullstacktrace:");
e.printStackTrace(System.out);
System.exit(0);
}catch(Exceptione){
System.out.println("Somethingbadhappened:"+e.getMessage());
}

}

publicArrayList<Employee>getEmployees(){
returnemployees;
}

publicdoublemonthlyPayroll(){
CalendarrightNow=Calendar.getInstance();
returnmonthlyPayroll(rightNow);
}

publicdoublemonthlyPayroll(Calendarmonth){
doublepayroll=0.0;
for(Employeeemployee:employees){
payroll+=employee.monthlyPay(month);
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

privatevoidinitFromFile(FileempData)throwsFileNotFoundException,
IOException,
ParseException{
BufferedReaderreader=newBufferedReader(newFileReader(empData));
intlineNumber=1;
Stringline=reader.readLine();
while(line!=null){
String[]fields=line.split(";");
if(fields[0].trim().equalsIgnoreCase("SalariedEmployee")){
employees.add(makeSalariedEmployee(fields));
}elseif(fields[0].trim().
equalsIgnoreCase("HourlyEmployee")){
employees.add(makeHourlyEmployee(fields));
}else{
employees.add(makeSummerIntern(fields));
}
line=reader.readLine();
lineNumber++;
}
}

privateSalariedEmployeemakeSalariedEmployee(String[]fields)
throwsParseException{
Stringname=fields[1].trim();
DatehireDate=DateFormat.getDateInstance().parse(fields[2].trim());
doubleannualSalary=Double.parseDouble(fields[3].trim());
returnnewSalariedEmployee(name,hireDate,annualSalary);
}

privateHourlyEmployeemakeHourlyEmployee(String[]fields)
throwsParseException{
Stringname=fields[1].trim();
DatehireDate=DateFormat.getDateInstance().parse(fields[2].trim());
doublehourlyWage=Double.parseDouble(fields[3].trim());
doublemonthlyHours=Double.parseDouble(fields[4].trim());
returnnewHourlyEmployee(name,hireDate,hourlyWage,monthlyHours);
}

privateHourlyEmployeemakeSummerIntern(String[]fields)
throwsParseException{
Stringname=fields[1].trim();
DatehireDate=DateFormat.getDateInstance().parse(fields[2].trim());
doublehourlyWage=Double.parseDouble(fields[3].trim());
doublemonthlyHours=Double.parseDouble(fields[4].trim());
returnnewSummerIntern(name,hireDate,hourlyWage,monthlyHours);
}

publicstaticvoidmain(String[]args)throwsFileNotFoundException{
Companyc=newCompany("employees.data");
System.out.println(c);
Calendarmay=Calendar.getInstance();
may.set(Calendar.MONTH,Calendar.MAY);
Calendarjune=Calendar.getInstance();
june.set(Calendar.MONTH,Calendar.JUNE);
System.out.println(c.employees.get(0).monthlyPay());
System.out.printf("MonthlypayrollforMay:%.2f%n",
c.monthlyPayroll(may));
System.out.printf("MonthlypayrollforJune:%.2f%n",
c.monthlyPayroll(june));
}
}
