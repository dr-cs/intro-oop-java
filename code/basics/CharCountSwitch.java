/**
*ThisprogramperformsthesametaskasCharCountSwitch.javabutwithout
*aswitchstatement.
*/
publicclassCharCountSwitch{

publicstaticvoidmain(String[]args){
System.out.print("Enterastringofcharacters:");
Strings=System.console().readLine();
intdigitCount=0,punctuationCount=0,letterCount=0;
for(inti=0;i<s.length();++i){
switch(s.charAt(i)){
case'0':
case'1':
case'2':
case'3':
case'4':
case'5':
case'6':
case'7':
case'8':
case'9':
//Fall-throughmatchesalldigits
digitCount++;
break;
case'!':
case'?':
case'.':
//Fall-throughmatchesallpunctuation
punctuationCount++;
break;
default:
//Othersareassumedtobeletters
letterCount++;
//breakisoptionalafterthedefaultcase
}
//Willthecodeaboveprovideanaccuratecountofletters?
}
System.out.printf("Yourinputcontained%ddigits,%d"
+"punctuaionmarks,and%dletters.%n",
digitCount,punctuationCount,letterCount);
}
}
