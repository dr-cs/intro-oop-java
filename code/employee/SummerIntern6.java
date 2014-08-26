import java.text.DateFormat;
import java.util.Date;

public class SummerIntern6 extends HourlyEmployee6 {

    public SummerIntern6(String name, Date hireDate) {
        this(name, hireDate, 20.00, 160.0);
    }
    
    public SummerIntern6(String name, Date hireDate, double hourlyWage) {
        this(name, hireDate, hourlyWage, 160.0);
    }

    public SummerIntern6(String name, Date hireDate, 
                        double hourlyWage, double monthlyHours) {
        super(name, hireDate, hourlyWage, monthlyHours);
    }

    public double monthlyPay() {
        Date today = new Date();
        Month thisMonth = Month.values()[today.getMonth()];
        return monthlyPay(thisMonth);
    }

    public double monthlyPay(Month month) {
        super.disallowNullArguments(month);
        if (isSummer(month)) {
            return super.monthlyPay();
        }
        return 0.0;
    }

    private boolean isSummer(Month month) {
        return month == Month.JUN 
            || month == Month.JUL 
            || month == Month.AUG;
    }

    public String toString() {
        return super.toString() + " (Summer Intern)";
    }

    public static void main(String[] args) throws Exception {
        DateFormat df = DateFormat.getDateInstance();
        SummerIntern6 fred = new SummerIntern6("Fred",
                                               df.parse("February 27, 2013"),
                                               20.00, 100);

        System.out.println("This month's pay: " + fred.monthlyPay());
        System.out.println("May pay: " + fred.monthlyPay(Month.MAY));
        System.out.println("June pay: " + fred.monthlyPay(Month.JUN));

        HourlyEmployee6 barney = (HourlyEmployee6) fred;
        System.out.println(barney);
    }
}
