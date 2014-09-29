publicclassCard2{

privateStringrank;
privateStringsuit;

publicStringtoString(){
returnrank+"of"+suit;
}

publicstaticvoidmain(String[]args){
Card2c=newCard2();
c.rank="ace";
c.suit="base";
System.out.println(c);
}
}
