importjava.awt.Color;

publicclassCoffeeShop{

publicstaticvoidmain(String[]args){
Personfred=newPerson("Fred");
HipstersoyLatte=newHipster(fred,0,5,Color.ORANGE);
System.out.println("blackCoffee.equals(soyLatte)=="
+blackCoffee.equals(soyLatte));
//Symmetrybroken.Notanequivalencerelation,improper
//equals()impolementation.
System.out.println("soyLatte.equals(blackCoffee)=="
+soyLatte.equals(blackCoffee));
}
}
