import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class EmployeeDemo5 {

    /**
     * Demonstrates the use of Employee and sublclasses thereof.
     *
     * @throws java.text.ParseException if the date String supplied
     *         to DateFormat.parse is not properly formatted.
     */
    public static void main(String[] args) throws ParseException {
        DateFormat df = DateFormat.getDateInstance();
        HourlyEmployee5 eva = new HourlyEmployee5("Eva L. Uator",
                                                  df.parse("February 18, 2013"),
                                                  20.00, 160);
        System.out.println(eva.getName() + " was hired on " +eva.getHireDate());
    }
}
