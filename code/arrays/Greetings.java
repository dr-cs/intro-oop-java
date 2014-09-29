importjava.util.Random;

publicclassGreetings{

privatestaticfinalString[]GREETINGS={"Hi","Hello","W'sup"};

publicstaticvoidmain(String[]args){
Randomrand=newRandom();
intgreeting=rand.nextInt(GREETINGS.length);
System.out.print(GREETINGS[greeting]);
if(args.length>0){//Whatifwedidn'tincludethischeck?
System.out.print(","+args[0]);
}
System.out.println("!");
}
}
