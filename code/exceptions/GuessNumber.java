importjava.util.Scanner;
importjava.util.InputMismatchException;

publicclassGuessNumber{

publicstaticvoidmain(String[]args){
System.out.println("I'mthinkingofanumberbetween1and10.");
Scannerkbd=newScanner(System.in);
intnumber=0;
booleanisValidInput=false;
while(!isValidInput){
try{
System.out.print("Enteraninteger:");
number=kbd.nextInt();
//IfnextInt()throwsanexception,wewon'tgethere
isValidInput=true;
}catch(InputMismatchExceptione){
//ThisnextLine()consumesthetokenthat
//nextInt()couldn'ttranslatetoanint.
Stringinput=kbd.nextLine();
System.out.println(input+"isnotaninteger.");
System.out.println("Tryagain.");
}
}
}
}
