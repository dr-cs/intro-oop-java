importjava.util.Random;

publicclassDeck{

privatePlayingCard[]cards;
privateinttopCard;

publicDeck(){
cards=newPlayingCard[52];
topCard=51;
intcardNumber=0;
for(PlayingCard.Suitsuit:PlayingCard.Suit.values()){
for(PlayingCard.Rankrank:PlayingCard.Rank.values()){
cards[cardNumber]=newPlayingCard(rank,suit);
cardNumber++;
}
}
}

publicvoidshuffle(){
Randomrand=newRandom();
for(inti=0;i<100;i++){
intcard1=rand.nextInt(topCard+1);
intcard2=rand.nextInt(topCard+1);
swap(card1,card2);
}
}

privatevoidswap(intcard1,intcard2){
PlayingCardtmp=cards[card1];
cards[card1]=cards[card2];
cards[card2]=tmp;
}

publicPlayingCarddraw(){
topCard--;
assert(topCard>=-1);
returncards[topCard+1];
}

publicbooleanhasCards(){
returntopCard>=0;
}

publicStringtoString(){
StringBuffersb=newStringBuffer();
for(inti=0;i<=topCard;++i){
sb.append(cards[i].toString()
+System.getProperty("line.separator"));
}
returnsb.toString();
}

publicstaticvoidmain(String[]args){
Deckdeck=newDeck();
System.out.println("Newdeck:");
System.out.println(deck);
deck.shuffle();
System.out.println("Shuffleddeck:");
System.out.println(deck);
System.out.println("Afewdraws:");
System.out.println(deck.draw());
System.out.println(deck.draw());
System.out.println(deck.draw());
System.out.println("Drawtheremainingcards:");
while(deck.hasCards()){
System.out.println(deck.draw());
}
}
}
