import java.util.Calendar;
import java.util.Date;

public abstract class Employee {

private String name;
private Date hireDate;

public Employee(String aName, Date aHireDate) {
ValidationUtils.disallowNullArguments(aName, aHireDate);
name = aName;
hireDate = aHireDate;
}

public abstract double monthlyPay();

public String getName() {
return name;
}

public Date getHireDate() {
return hireDate;
}

@Override
public String toString() {
return name + "; " + hireDate;
}

public boolean equals(Object other) {
if (other == null) return false;
if (this == other) return true;
if (!(other instanceof Employee)) return false;
Employee that = (Employee) other;
return name.equals(that.name) && hireDate.equals(that.hireDate);
}
}
