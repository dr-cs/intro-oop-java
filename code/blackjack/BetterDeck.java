importjava.util.ArrayList;
importjava.util.Random;

publicclassBetterDeck{

privateArrayList<PlayingCard>cards;

publicBetterDeck(){
cards=newArrayList<PlayingCard>(52);
for(PlayingCard.Suitsuit:PlayingCard.Suit.values()){
for(PlayingCard.Rankrank:PlayingCard.Rank.values()){
cards.add(newPlayingCard(rank,suit));
}
}
}

publicvoidshuffle(){
Randomrand=newRandom();
for(inti=0;i<100;i++){
intcard1=rand.nextInt(cards.size());
intcard2=rand.nextInt(cards.size());
swap(card1,card2);
}
}

privatevoidswap(intcard1,intcard2){
PlayingCardtmp=cards.get(card1);
cards.set(card1,cards.get(card2));
cards.set(card2,tmp);
}

publicPlayingCarddraw(){
returncards.remove(cards.size()-1);
}

publicbooleanhasCards(){
return!cards.isEmpty();
}

publicStringtoString(){
StringBuffersb=newStringBuffer();
for(PlayingCardcard:cards){
sb.append(cards.toString()
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
