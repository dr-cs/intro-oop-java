importjava.util.Arrays;

publicclassCard5{

privatefinalString[]VALID_RANKS=
{"2","3","4","5","6","7","8","9",
"10","jack","queen","king","ace"};

privatefinalString[]VALID_SUITS=
{"diamonds","clubs","hearts","spades"};

privateStringrank;
privateStringsuit;

publicStringtoString(){
returnrank+"of"+suit;
}

publicvoidsetRank(Stringrank){
if(!isValidRank(rank)){
System.out.println(rank+"isnotavalidrank.");
System.exit(0);
}
this.rank=rank;
}

privatebooleanisValidRank(StringsomeRank){
returncontains(VALID_RANKS,someRank);
}

publicvoidsetSuit(Stringsuit){
if(!isValidSuit(suit)){
System.out.println(suit+"isnotavalidsuit.");
System.exit(0);
}
this.suit=suit;
}

privatebooleanisValidSuit(StringsomeSuit){
returncontains(VALID_SUITS,someSuit);
}

privatebooleancontains(String[]array,Stringitem){
for(Stringelement:array){
if(element.equals(item)){
returntrue;
}
}
returnfalse;
}
}
