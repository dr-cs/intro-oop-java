import java.awt.Color;

public class CoffeeShop {

public static void main(String[] args) {
Person fred = new Person("Fred");
Hipster soyLatte = new Hipster(fred, 0, 5, Color.ORANGE);
System.out.println("blackCoffee.equals(soyLatte) == "
+ blackCoffee.equals(soyLatte));
// Symmetry broken.  Not an equivalence relation, improper
// equals() impolementation.
System.out.println("soyLatte.equals(blackCoffee) == "
+ soyLatte.equals(blackCoffee));
}
}
