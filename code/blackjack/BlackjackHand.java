publicclassBlackjackHandimplementsComparable{

privatePlayingCardfaceDownCard;
privatePlayingCard[]faceUpCards;
privateintlastFaceUpCard;

publicBlackjackHand(){
faceUpCards=newPlayingCard[10];
intlastFaceUpCard=-1;
}

publicvoidaddFaceDown(PlayingCardcard){
faceDownCard=card;
}

publicvoidaddFaceUp(PlayingCardcard){
if(null==faceDownCard){
System.out.println("Can'taddafaceupcardbeforeaddinga"+
"facedowncard.Handstillempty.");
}else{
faceUpCards[lastFaceUpCard++]=card;
}
}

publicintvalue(){
if(null==faceDownCard)return0;
intvalue=cardValue(faceDownCard);
for(inti=0;i<lastFaceUpCard;++i){
value+=cardValue(faceUpCards[i]);
}
intacesRemaining=countAces();
while((value>21)&&(acesRemaining>0)){
value-=10;
acesRemaining--;
}
returnvalue;
}

privateintcardValue(PlayingCardcard){
if(card.getRank()==PlayingCard.Rank.JACK
||card.getRank()==PlayingCard.Rank.QUEEN
||card.getRank()==PlayingCard.Rank.KING){
return10;
}elseif(card.getRank()==PlayingCard.Rank.ACE){
return11;
}else{
returncard.getRank().ordinal();
}
}

privateintcountAces(){
intcount=(faceDownCard.getRank()==PlayingCard.Rank.ACE)?1:0;
for(inti=0;i<lastFaceUpCard;++i){
if(faceUpCards[i].getRank()==PlayingCard.Rank.ACE)count++;
}
returncount;
}

publicintcompareTo(Objectother){
//First,makesurewe'recomparingtoanotherBlackjackHand
if(!(otherinstanceofBlackjackHand)){
Stringmsg="Can'tcompareaBlackjacHandobjecttoa"+
other.getClass().getName()+"object:"+other;
thrownewIllegalArgumentException(msg);
}
//Nowthisisguaranteedtowork
BlackjackHandthat=(BlackjackHand)other;
returnthis.value()-that.value();
}

publicStringtoString(){
if(null==faceDownCard){
return"Emptyhand.";
}elseif(faceUpCards.length<1){
return"Onefacedowncard.";
}else{
Stringret="Onefacedowncardand:"+
System.getProperty("line.separator");
for(inti=0;i<lastFaceUpCard;++i){
ret+=faceUpCards[i]+System.getProperty("line.separator");
}
returnret;
}
}

publicStringshow(){
if(null==faceDownCard){
return"Emptyhand.";
}else{
Stringret=faceDownCard+System.getProperty("line.separator");
for(inti=0;i<lastFaceUpCard;++i){
ret+=faceUpCards[i]+System.getProperty("line.separator");
}
returnret;
}
}

publicstaticvoidmain(String[]args){
BlackjackHandhand=newBlackjackHand();
System.out.println("Newhand:");
System.out.println(hand.toString());
PlayingCardace=newPlayingCard(PlayingCard.Rank.ACE,
PlayingCard.Suit.SPADES);
hand.addFaceDown();
System.out.println("Afteronefacedowncard:");
System.out.println(hand.toString());
System.out.println("Afteronefaceupcard:");
hand.addFaceUp(deck.draw());
System.out.println(hand.toString());
System.out.println("Valueshouldbe21:");
System.out.println(hand.value());
}
}
