importjava.util.Arrays;

publicclassCard{

publicstaticfinalString[]VALID_RANKS=
{"2","3","4","5","6","7","8","9",
"10","jack","queen","king","ace"};
publicstaticfinalString[]VALID_SUITS=
{"diamonds","clubs","hearts","spades"};

privateStringrank;
privateStringsuit;

publicCard(StringaRank,StringaSuit){
StringtheRank=normalizeString(aRank);
StringtheSuit=normalizeString(aSuit);
if(isValidRank(theRank)){
rank=theRank;
}else{
Stringmsg="Illegalrank:"+theRank;
thrownewIllegalArgumentException(msg);
}
if(isValidSuit(theSuit)){
suit=theSuit;
}else{
Stringmsg="Illegalsuit:"+theSuit;
thrownewIllegalArgumentException(msg);
}
}
privatestaticStringnormalizeString(StringsomeString){
returnsomeString.trim().toLowerCase();
}

privatestaticbooleanisValidRank(StringsomeRank){
returnArrays.asList(VALID_RANKS).contains(someRank);
}

privatestaticbooleanisValidSuit(StringsomeSuit){
returnArrays.asList(VALID_SUITS).contains(someSuit);
}

publicStringtoString(){
returnrank+"of"+suit;
}

publicbooleanequals(Objectother){
if(other==null)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofCard))returnfalse;
Cardthat=(Card)other;
returnthis.rank.equals(that.rank)&&this.suit.equals(that.suit);
}

publicstaticvoidmain(String[]args){
Cardc1=newCard("ace","spades");
Cardc2=newCard("ace","spades");
Cardc3=c1;
System.out.println("c1==c2returns"+(c1==c2));
System.out.println("c1.equals(c2)returns"+c1.equals(c2));
System.out.println("c1==c3returns"+(c1==c3));
System.out.println("c1.equals(c3)returns"+c1.equals(c3));

Stringa="foo";
Stringb="foo";

System.out.println(a==b);
}
}
