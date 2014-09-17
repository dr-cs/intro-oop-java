import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

public class SuperTroopers {

    static class Trooper implements Comparable<Trooper> {

        private String name;
        private boolean mustached;

        public Trooper(String name, boolean hasMustache) {
            this.name = name;
            this.mustached = hasMustache;
            MustacheComparator mc = new MustacheComparator();
        }

        public String getName() { return name; }
        public boolean hasMustache() { return mustached; }

        public String toString() {
            return getName() + (hasMustache() ? " :-{" : " :-|");
        }

        public boolean equals(Object other) {
            if (null == other) return false;
            if (this == other) return true;
            if (!(other instanceof Trooper)) return false;
            Trooper that = (Trooper) other;
            return this.name.equals(that.name) && this.mustached == that.mustached;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + (mustached ? 1 : 0);
            return result;
        }

        public int compareTo(Trooper other) {
            return this.name.compareTo(other.name);
        }
    }

    static class MustacheComparator implements Comparator<Trooper> {

        public int compare(Trooper a, Trooper b) {
            if (a.hasMustache() && !b.hasMustache()) {
                return 1;
            } else if (b.hasMustache() && !a.hasMustache()) {
                return -1;
            } else {
                return a.getName().compareTo(b.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Trooper> troopers = new ArrayList();
        troopers.add(new Trooper("Thorny", true));
        troopers.add(new Trooper("Farva", true));
        troopers.add(new Trooper("Farva", true));
        troopers.add(new Trooper("Ursula", false));
        troopers.add(new Trooper("Rabbit", false));
        troopers.add(new Trooper("Mac", true));
        troopers.add(new Trooper("Foster", true));

        System.out.println("Before sorting:\n" + troopers);

        // Note that sort() is destructive, that is, it modifies the
        // collection rather than returning a sorted copy.
        Collections.sort(troopers);
        System.out.println("\nAfter sorting:\n" + troopers);

        Collections.sort(troopers, new MustacheComparator());
        System.out.println("\nAfter mustache - based sorting:\n" + troopers);

        Collections.sort(troopers, new Comparator<Trooper>() {
            public int compare(Trooper a, Trooper b) {
                if (a.hasMustache() && !b.hasMustache()) {
                return -1;
            } else if (b.hasMustache() && !a.hasMustache()) {
                return 1;
            } else {
                return -a.getName().compareTo(b.getName());
            }
            }
        });
        System.out.println("\nAfter reverse mustache - based sorting:\n" + troopers);


        // Collections.sort(troopers, new ReverseMustacheComparator());
        // System.out.println("\nAfter reverse mustache - based sorting:\n"
        //                    + troopers);




        // Notice that you can create a new collection by passing an
        // existing collection to the constructor.  This is a
        // convention in the collections framework, but is not
        // guaranteed by any language feature of Java.
        Set<Trooper> trooperSet = new HashSet<>(troopers);

        // Notice that duplicates are removed, which is good, 'cuz who
        // needs two Farvas?
        System.out.println("\nAs a set:\n" + trooperSet);

        System.out.println("Mac's hashCode: "
                           + new Trooper("Mac", true).hashCode());
        System.out.println("Mac's hashCode: "
                           + new Trooper("Mac", true).hashCode());
        System.out.println("Mac's hashCode: "
                           + new Trooper("Mac", true).hashCode());

        // Mac is in the set, but we don't find him because we didn't
        // override hashCode().
        System.out.println("\nOops!  Didn't override hashCode():");
        System.out.println("trooperSet.contains(new Trooper(\"Mac\", true))="
                           + trooperSet.contains(new Trooper("Mac", true)));
    }

}
