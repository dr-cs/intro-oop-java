import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class HourlyEmployee extends Employee {

public static String YAY = "yay!";

private double hourlyWage;
private double monthlyHours;

/**
* Constructs an HourlyEmployee with hourly wage of 20 and 
* monthly hours of 160.
*/
public HourlyEmployee(String aName, Date aHireDate) {
this(aName, aHireDate, 20.00, 160.0);
}

public HourlyEmployee(String aName, Date aHireDate,
double anHourlyWage, double aMonthlyHours) {
super(aName, aHireDate);
ValidationUtils..disallowZeroesAndNegatives(anHourlyWage,
aMonthlyHours);
hourlyWage = anHourlyWage;
monthlyHours = aMonthlyHours;
}

public String getName() {
return "Hourly: " + super.getName();
}

public double getHourlyWage() {
return hourlyWage;
}

public void setHourlyWage(double newWage) {
hourlyWage = newWage;
}

public double getMonthlyHours() {
return monthlyHours;
}

public double monthlyPay() {
return hourlyWage * monthlyHours;
}

public String toString() {
return getName() + "; Hire Date: " + getHireDate() + "; Hourly Wage: "
+ hourlyWage + "; Monthly Hours: " + monthlyHours;
}


public static void main(String[] args) throws Exception {
System.out.println(YAY);
DateFormat df = DateFormat.getDateInstance();
HourlyEmployee eva = new HourlyEmployee("Eva Luator",
df.parse("June 10, 2013"));

System.out.println("eva's name: " + eva.getName());

}
}
