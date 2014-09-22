import java.util.ArrayList;

public class Doberman {

    public static String STD_DOBIE_SIZE = "large";

    private static int dobieCount = 0;

    private String name;

    public Doberman(String name) {
        this.name = name;
        dobieCount++;
    }

    public String reportDobieCount() {
        return name + " says there are " + dobieCount + " dobies.";
    }

    public boolean equals(Doberman other) {
        if (null == other) { return false; }
        if (this == other) { return true; }
        if (!(other instanceof Doberman)) { return false;}
        return this.name.equals(((Doberman) other).name);
    }

    public static void main(String[] args) {
        ArrayList daringDobermans = new ArrayList();
        daringDobermans.add(new Doberman("Chloe"));
        System.out.println(daringDobermans.contains(new Doberman("Chloe")));
        Doberman d = null;
        System.out.println(d.toString());
    }
}
