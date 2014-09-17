import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company6 {

    private Employee6[] employees;

    public Company6() throws Exception {
        DateFormat df = DateFormat.getDateInstance();
        Employee6[] theEmployees = {
            new SalariedEmployee6("Ada Lovelace",
                                 df.parse("December 10, 1815"), 120000),
            new SalariedEmployee6("Alan M. Turing",
                                 df.parse("June 23, 1912"), 120000),
            new SalariedEmployee6("John McCarthy",
                                 df.parse("September 4, 1927"), 120000),
            new SalariedEmployee6("John Backus",
                                 df.parse("December 3, 1924"), 120000),
            new SalariedEmployee6("John von Neumann",
                                 df.parse("December 29, 1903"), 120000),
            new SalariedEmployee6("Donald Knuth",
                                 df.parse("January 10, 1938"), 120000),
            new SalariedEmployee6("Guy Steele",
                                 df.parse("October 2, 1954"), 120000),
            new SalariedEmployee6("Robin Milner",
                                 df.parse("January 13, 1934"), 120000),
            new HourlyEmployee6("Eva L. Uator",
                               df.parse("February 13, 2013"), 20.00, 200),
            new SummerIntern6("Wayne Garth",
                              df.parse("February 25, 2014"), 20.00, 200),
        };
        employees = theEmployees;
    }

    public double monthlyPayroll() {
        Date today = new Date();
        Month thisMonth = Month.values()[today.getMonth()];
        return monthlyPayroll(thisMonth);
    }

    public double monthlyPayroll(Month month) {
        double payroll = 0.0;
        for (Employee6 employee: employees) {
            payroll +=  employee.monthlyPay(month);
        }
        return payroll;
    }

    public String toString() {
        String ret = "";
        for (Employee6 employee: employees) {
            ret += employee + "\n";
        }
        return ret;
    }

    public static Date vestDate(Employee4 employee) {
        Date hireDate = employee.getHireDate();
        int vestYear = hireDate.getYear() + 2;
        return new Date(vestYear, hireDate.getMonth(), hireDate.getDay());
    }

    public static void main(String[] args) throws Exception {
        Company6 c = new Company6();
        System.out.println("Monthly payroll this month: " + c.monthlyPayroll());
        System.out.printf("Monthly payroll for May: %.2f%n",
                  c.monthlyPayroll(Month.MAY));
        System.out.printf("Monthly payroll for June: %.2f%n",
                  c.monthlyPayroll(Month.JUN));

        DateFormat df = DateFormat.getDateInstance();
        HourlyEmployee4 eva = new HourlyEmployee4("Eva L. Uator",
                           df.parse("February 13, 2013"), 20.00, 200);
        Date evaVestDate = vestDate(eva);
        System.out.println(eva.getName() + " vests on " + evaVestDate);
        System.out.println(Month.valueOf("FEB"));
    }
}
