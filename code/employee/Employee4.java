import java.util.Calendar;
import java.util.Date;

public abstract class Employee4 {

private String name;
private Date hireDate;

public Employee4(String aName, Date aHireDate) {
disallowNullArguments(aName, aHireDate);
name = aName;
hireDate = aHireDate;
}

private void disallowNullArguments(Object ... args) {
boolean shouldThrowException = false;
for (Object arg: args) {
if (arg == null) {
shouldThrowException = true;
}
}
if (shouldThrowException) {
String msg = "null arguments not allowed. ";
throw new IllegalArgumentException(msg);
}
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

// --------------------------------------------------------

public boolean equals(Object other) {
if (other == null) return false;
if (this == other) return true;
if (!(other instanceof Employee)) return false;
Employee4 that = (Employee4) other;
return name.equals(that.name) && hireDate.equals(that.hireDate);
}
}
