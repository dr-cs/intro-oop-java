importjava.io.BufferedReader;
importjava.io.File;
importjava.io.FileReader;
importjava.io.FileNotFoundException;
importjava.io.IOException;
importjava.text.DateFormat;
importjava.text.ParseException;
importjava.util.ArrayList;
importjava.util.Date;

publicclassCompany{

privateArrayList<Employee>employees;


publicCompany(StringemployeeDataFile){
try{
employees=initFromFile(newFile(employeeDataFile));
}catch(FileNotFoundExceptione){
System.out.println("Can'trunwithoutanemployeedatafile.");
System.out.println(e.getMessage());
System.exit(0);
}catch(IOExceptione){
System.out.println(e.getMessage());
e.printStackTrace(System.out);
System.exit(0);
}catch(ParseExceptione){
Stringmsg="Malformeddatacausedexception:"+e.getMessage();
System.out.println(msg);
System.out.println("Fullstacktrace:");
e.printStackTrace(System.out);
System.exit(0);
}catch(Exceptione){
System.out.println("Somethingbadhappened:"+e.getMessage());
e.printStackTrace(System.out);
System.exit(0);
}
}

publicvoidCompany(StringempDataFile)throwsException{
employees=initFromFile2(newFile(empDataFile));
if(null==employees){
System.out.println("Therewasanerrorinitializingemployees.");
System.out.println("Perhaps"+empDataFile+"doesn'texist?");
System.exit(1);
}
}

publicdoublemonthlyPayroll(){
doublepayroll=0.0;
inti=0;
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


privateArrayList<Employee>initFromFile(FileempData)
throwsFileNotFoundException,IOException,ParseException{
ArrayList<Employee>emps=newArrayList<>();
BufferedReaderreader=newBufferedReader(newFileReader(empData));
Stringline=reader.readLine();
while(line!=null){
String[]fields=line.split(";");
if(fields[0].trim().equalsIgnoreCase("Salaried")){
emps.add(makeSalariedEmployee(fields));
}else{
emps.add(makeHourlyEmployee(fields));
}
line=reader.readLine();
}
returnemps;
}


privateArrayList<Employee>initFromFile2(FileempData)
throwsFileNotFoundException{
ArrayList<Employee>emps=newArrayList<>();
BufferedReaderreader=newBufferedReader(newFileReader(empData));
intlineNumber=1;
try{
Stringline=reader.readLine();
while(line!=null){
try{
String[]fields=line.split(";");
if(fields[0].trim().equalsIgnoreCase("Salaried")){
emps.add(makeSalariedEmployee(fields));
}else{
emps.add(makeHourlyEmployee(fields));
}
}catch(ParseExceptione){
Stringmsg="Malformeddataatline"+lineNumber
+",causedby"+e.getMessage();
System.out.println(msg);
System.out.println("Fullstacktrace:");
e.printStackTrace(System.out);
returnnull;
}
line=reader.readLine();
lineNumber++;
}
}catch(IOExceptione){
Stringmsg="Unabletoreadline"+lineNumber
+",causedby"+e.getMessage();
System.out.println(msg);
System.out.println("Fullstacktrace:");
e.printStackTrace(System.out);

}
returnemps;
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

publicstaticvoidmain(String[]args)throwsFileNotFoundException{
Companyc=newCompany("employees.data");
System.out.println(c);
System.out.printf("Monthlypayroll:%.2f",c.monthlyPayroll());
}
}
