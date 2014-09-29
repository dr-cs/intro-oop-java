importjava.util.Arrays;

publicclassCard6{

publicstaticfinalString[]VALID_RANKS=
{"2","3","4","5","6","7","8","9",
"10","jack","queen","king","ace"};
publicstaticfinalString[]VALID_SUITS=
{"diamonds","clubs","hearts","spades"};

privateStringrank;
privateStringsuit;

publicCard6(Stringrank,Stringsuit){
setRank(rank);
setSuit(suit);
}

publicvoidsetRank(Stringrank){
if(!isValidRank(rank)){
System.out.println(rank+"isnotavalidrank.");
System.exit(0);
}
this.rank=rank;
}

privatebooleanisValidRank(StringsomeRank){
returnArrays.asList(VALID_RANKS).contains(someRank);
}

publicvoidsetSuit(Stringsuit){
if(!isValidSuit(suit)){
System.out.println(suit+"isnotavalidsuit.");
System.exit(0);
}
this.suit=suit;
}

privatebooleanisValidSuit(StringsomeSuit){
returnArrays.asList(VALID_SUITS).contains(someSuit);
}

publicStringtoString(){
returnrank+"of"+suit;
}
}
