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

public class Company4 {

    private Employee[] employees;

    public Company4() throws Exception {
        DateFormat df = DateFormat.getDateInstance();
        Employee[] theEmployees = {
            new SalariedEmployee("Ada Lovelace", 
                                 df.parse("December 10, 1815"), 120000),
            new SalariedEmployee("Alan M. Turing",
                                 df.parse("June 23, 1912"), 120000),
            new SalariedEmployee("John McCarthy",
                                 df.parse("September 4, 1927"), 120000),
            new SalariedEmployee("John Backus",
                                 df.parse("December 3, 1924"), 120000),
            new SalariedEmployee("John von Neumann",
                                 df.parse("December 29, 1903"), 120000),
            new SalariedEmployee("Donald Knuth",
                                 df.parse("January 10, 1938"), 120000),
            new SalariedEmployee("Guy Steele",
                                 df.parse("October 2, 1954"), 120000),
            new SalariedEmployee("Robin Milner",
                                 df.parse("January 13, 1934"), 120000),
            new HourlyEmployee("Eva L. Uator",
                               df.parse("February 13, 2013"), 20.00, 200),
        };
        employees = theEmployees;
    }

    public double monthlyPayroll() {
        double payroll = 0.0;
        for (Employee employee: employees) {
            payroll +=  employee.monthlyPay();
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
    
    public static Date vestDate(Employee4 employee) {
        Date hireDate = employee.getHireDate();
        int vestYear = hireDate.getYear() + 2;
        return new Date(vestYear, hireDate.getMonth(), hireDate.getDay());
    }

    public static void main(String[] args) throws Exception {
        Company4 c = new Company4();
        System.out.println(c);
        System.out.println("Monthly payroll: " + c.monthlyPayroll());
        
        DateFormat df = DateFormat.getDateInstance();
        HourlyEmployee4 eva = new HourlyEmployee4("Eva L. Uator",
                           df.parse("February 13, 2013"), 20.00, 200);
        Date evaVestDate = vestDate(eva);
        System.out.println(eva.getName() + " vests on " + evaVestDate);
    }
}
