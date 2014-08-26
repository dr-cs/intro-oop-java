import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class SalariedEmployee5 extends Employee5 {

    private static final int MONTHS_PER_YEAR = 12;

    private final double annualSalary;

    public SalariedEmployee5(String aName, Date aHireDate,
                            double anAnnualSalary) {
        super(aName, aHireDate);
        disallowZeroesAndNegatives(anAnnualSalary);
        annualSalary = anAnnualSalary;
    }

    @Override
    public String getName() {
        return "Salaried: " + super.getName();
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double monthlyPay() {
        return annualSalary / MONTHS_PER_YEAR;
    }

    public String toString() {
        return super.toString() + "; Annual Salary: " + annualSalary;
    }

    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof SalariedEmployee3)) return false;
        SalariedEmployee5 that = (SalariedEmployee5) other;
        return super.equals(that) && (this.annualSalary == that.annualSalary);
    }

    public static void main(String[] args) throws Exception {
        DateFormat df = DateFormat.getDateInstance();
        SalariedEmployee5 eva = new SalariedEmployee5("Eva Luator",
                                                      df.parse("June 10, 2013"),
                                                      1000000);
        System.out.println(eva.getName());
    }
}
