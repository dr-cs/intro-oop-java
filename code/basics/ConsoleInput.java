importjava.util.Scanner;

classConsoleInput{

publicstaticvoidmain(String[]args){
intexam1,exam2,exam3;
doubleexamAvg,hwAvg,finalExam,courseAvg;
Scannerkeyboard=newScanner(System.in);
Stringtoken1=keyboard.next();
exam1=Integer.parseInt(token1);
exam2=keyboard.nextInt();
exam3=keyboard.nextInt();

examAvg=(exam1+exam2+exam3)/3.0;//Why3.0insteadof3?
System.out.printf("Yourexamaverageis%.1f%n",examAvg);
}
}
