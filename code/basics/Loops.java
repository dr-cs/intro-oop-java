publicclassLoops{

publicstaticvoidmain(String[]args){
booleanshouldContinue=true;
while(shouldContinue){
System.out.println("Enterastringofalphanumericcharacters"+
"(exittoquit):");
Stringinput=System.console().readLine();
intdigitCount=0,letterCount=0;
for(inti=0;i<input.length();++i){
charc=input.charAt(i);
if(Character.isDigit(c))digitCount++;
if(Character.isAlphabetic(c))letterCount++;
}
System.out.printf("Inputcontained%ddigitsand%dletters.%n",
digitCount,letterCount);
shouldContinue=(input.equalsIgnoreCase("exit"))?false:true;
}

for(inti=0;i<10;++i)
System.out.println("Meow!");

Stringmystery="mnerigpaba";
Stringsolved="";
intlen=mystery.length();
for(inti=0,j=len-1;i<len/2;++i,--j){
solved=solved+mystery.charAt(i)+mystery.charAt(j);
}
System.out.println(solved);

//Ifyouuncommenteitherofthesefor-everloops,
//you'llhavetouseCtrl-Ctostoptheprogram.

//for(;;){
//ever
//}

//while(true}{
////forever
//}
}
}
