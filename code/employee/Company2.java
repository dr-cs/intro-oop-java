import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Company2 {

private ArrayList<Employee> employees;
private Employee[] emps;

public Company2(String employeeDataFile) throws FileNotFoundException {
employees = new ArrayList<Employee>(10);
emps = new Employee[10];
loadEmployeesFromFile(new File(employeeDataFile));
}

public double monthlyPayroll() {
double payroll = 0.0;
int i = 0;
for (Employee employee: employees) {
payroll += employee.monthlyPay();
System.out.println(emps[i].monthlyPay());
i++;
}
return payroll;
}

public String toString() {
String ret = "";
for (Employee employee: employees) {
ret += employee + "\n";
}
return ret;
}

private void loadEmployeesFromFile(File empData) 
throws FileNotFoundException {
BufferedReader reader = new BufferedReader(new FileReader(empData));
int lineNumber = 1;
try {
String line = reader.readLine();
while (line != null) {
try {
String[] fields = line.split(";");
if (fields[0].trim().equalsIgnoreCase("Salaried")) {
employees.add(makeSalariedEmployee(fields));
emps[lineNumber-1] = makeSalariedEmployee(fields);
} else {
employees.add(makeHourlyEmployee(fields));
emps[lineNumber-1] = makeHourlyEmployee(fields);
}
} catch (ParseException e) {
String msg = "Malformed data at line " + lineNumber 
+ ", caused by " + e.getMessage();
System.out.println(msg);
System.out.println("Full stack trace:");
e.printStackTrace(System.out);
System.exit(0);
}
line = reader.readLine();
lineNumber++;
}
} catch (IOException e) {
String msg = "Unable to read line " + lineNumber 
+ ", caused by " + e.getMessage();
System.out.println(msg);
System.out.println("Full stack trace:");
e.printStackTrace(System.out);
System.exit(0);
}
}

private SalariedEmployee makeSalariedEmployee(String[] fields) 
throws ParseException {
String name = fields[1].trim();
Date hireDate = DateFormat.getDateInstance().parse(fields[2].trim());
double annualSalary = Double.parseDouble(fields[3].trim());
return new SalariedEmployee(name, hireDate, annualSalary);
}

private HourlyEmployee makeHourlyEmployee(String[] fields)
throws ParseException {
String name = fields[1].trim();
Date hireDate = DateFormat.getDateInstance().parse(fields[2].trim());
double hourlyWage = Double.parseDouble(fields[3].trim());
double monthlyHours = Double.parseDouble(fields[4].trim());
return new HourlyEmployee(name, hireDate, hourlyWage, monthlyHours);
}

public static void main(String[] args) throws FileNotFoundException {
Company2 c = new Company2("employees.data");
System.out.println(c);
System.out.printf("Monthly payroll: %.2f", c.monthlyPayroll());
}
}
