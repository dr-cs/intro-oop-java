importjava.util.Random;

publicclassGreeter{

privatestaticfinalString[]GREETINGS={"Hi","Hello","W'sup"};

privateStringgreetee;

publicGreeter(Stringname){
greetee=name;
}

publicStringgreet(){
Randomrand=newRandom();
intindex=rand.nextInt(GREETINGS.length);
Stringgreeting=GREETINGS[index];
greeting+=","+greetee+"!";
returngreeting;
}

publicstaticvoidmain(String[]args){
Greetergreeter=newGreeter("bob");
Stringgreeting=greeter.greet();
System.out.println(greeting);
}
}
