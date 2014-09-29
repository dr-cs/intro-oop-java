publicclassAnimals{

publicstaticabstractclassAnimal{
publicabstractvoidspeak();
}

publicstaticclassMammalextendsAnimal{
publicvoidspeak(){
System.out.println("Hello!");
}
}
publicstaticclassDogextendsMammal{
publicvoidspeak(){
System.out.println("Woof,woof!");
}
publicvoidwagTail(){
System.out.println("(wagstail)");
}
}
publicstaticclassCatextendsMammal{
publicvoidspeak(){
System.out.println("Meow!");
}
}

publicstaticvoidmain(String[]args){
Mammalfido=newDog();
fido.speak();
//Dogfido2=fido;//Won'tcompile:Javawon'timplicitlydowncast
((Mammal)fido).speak();

Mammalmittens=(Mammal)newCat();//Safe
Mammalsparky=newMammal();
//Compiles,butwillcauseaClassCastExceptionatrun-time,
Doghuh=(Dog)sparky;
//sowewon'tevengethere.
huh.wagTail();
}

}
