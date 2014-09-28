import java.util.Date;

public class Employee3 {

private String name;
private Date hireDate;

public Employee3(String aName, Date aHireDate) {
disallowNullArguments(aName, aHireDate);
name = aName;
hireDate = aHireDate;
}

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

private void disallowNullArguments(Object ... args) {
boolean shouldThrowException = false;
String nullArgs = "";
for (Object arg: args) {
if (arg == null) {
shouldThrowException = true;
nullArgs += arg + " ";
}
}
if (shouldThrowException) {
String msg = "null arguments not allowed. ";
throw new IllegalArgumentException(msg);
}
}
}
