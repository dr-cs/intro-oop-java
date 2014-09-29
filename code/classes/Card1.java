publicclassCard1{

Stringrank;
Stringsuit;

publicStringtoString(){
returnrank+"of"+suit;
}

publicstaticvoidmain(String[]args){
Card1swedishPop=newCard1();
swedishPop.rank="ace";
swedishPop.suit="base";
Card1handy=newCard1();
handy.rank="jack";
handy.suit="alltrades";
System.out.println(swedishPop);
System.out.println(handy);
}
}
