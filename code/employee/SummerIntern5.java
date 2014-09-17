import java.text.DateFormat;
import java.util.Date;

public class SummerIntern5 extends HourlyEmployee5 {

    public SummerIntern5(String name, Date hireDate) {
        this(name, hireDate, 20.00, 160.0);
    }

    public SummerIntern5(String name, Date hireDate, double hourlyWage) {
        this(name, hireDate, hourlyWage, 160.0);
    }

    public SummerIntern5(String name, Date hireDate,
                        double hourlyWage, double monthlyHours) {
        super(name, hireDate, hourlyWage, monthlyHours);
    }

    public double monthlyPay(Month month) {
        super.disallowNullArguments(month);
        if (isSummer(month)) {
            return 0.0;//super.monthlyPay(month);
        }
        return 0.0;
    }

    private boolean isSummer(Month month) {
        System.out.println("In SummerIntern.isSummer(), month=" + month);
        return month == Month.JUN
            || month == Month.JUL
            || month == Month.AUG;
    }

    public String toString() {
        return super.toString() + " (Summer Intern)";
    }

    public static void main(String[] args) throws Exception {
        DateFormat df = DateFormat.getDateInstance();
        SummerIntern5 fred = new SummerIntern5("Fred",
                                               df.parse("February 27, 2013"),
                                               20.00, 100);

        System.out.println("Right now pay: " + ((Employee5) fred).monthlyPay());
        System.out.println("May pay: " + fred.monthlyPay(Month.MAY));
        System.out.println("June pay: " + fred.monthlyPay(Month.JUN));

        HourlyEmployee5 barney = (HourlyEmployee5) fred;
        System.out.println(barney);
    }
}
