importjava.util.Arrays;

publicclassPlayingCard{

publicenumRank{TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,
TEN,JACK,QUEEN,KING,ACE};
publicenumSuit{DIAMONDS,CLUBS,HEARTS,SPADES};

privateRankrank;
privateSuitsuit;

publicPlayingCard(StringaCardDescription){
this(extractRank(aCardDescription),extractSuit(aCardDescription));
}

privatestaticRankextractRank(StringcardDescription)
throwsIllegalArgumentException{
String[]parts=cardDescription.split("");
if(parts.length!=3){
Stringmsg="Illegalcarddescription:"+cardDescription;
msg+="\nCarddescriptionsmusthavetheform<rank>of<suit>";
msg+=",asin\"aceofspades\".";
thrownewIllegalArgumentException(msg);
}
returnRank.valueOf(normalizeString(parts[0].trim()));
}

privatestaticSuitextractSuit(StringcardDescription){
String[]parts=cardDescription.split("");
if(parts.length!=3){
Stringmsg="Illegalcarddescription:"+cardDescription;
msg+="\nCarddescriptionsmusthavetheform<rank>of<suit>";
msg+=",asin\"aceofspades\".";
thrownewIllegalArgumentException(msg);
}
returnSuit.valueOf(normalizeString(parts[2]));
}

privatestaticStringnormalizeString(StringsomeString){
returnsomeString.trim().toUpperCase();
}

publicPlayingCard(RankaRank,SuitaSuit){
rank=aRank;
suit=aSuit;
}

publicRankgetRank(){
returnrank;
}

publicSuitgetSuit(){
returnsuit;
}

publicStringtoString(){
returnrank+"of"+suit;
}

publicstaticvoidmain(String[]args){
System.out.print("Possibleranksare:");
for(Rankrank:Rank.values()){
System.out.print(rank+"");
}
System.out.println();

System.out.print("Possiblesuitsare:");
for(Suitsuit:Suit.values()){
System.out.print(suit+"");
}
System.out.println();
System.out.println("ExamplePlayingCards:");
PlayingCardc1=newPlayingCard(Rank.TWO,Suit.DIAMONDS);
System.out.println(c1);
PlayingCardc2=newPlayingCard("QuEenofheARts");
System.out.println(c2);
}
}
