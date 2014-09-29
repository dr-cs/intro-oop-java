importjava.util.Random;

publicclassRandomPlayerextendsBlackjackPlayer{

publicRandomPlayer(Stringname){
super(name);
}

publicMovegetMove(BlackjackHand...opponentHands){
if(hand.value()>=21)returnMove.STAND;
Randomrand=newRandom();
if(rand.nextInt(10)<3){
returnMove.HIT;
}else{
returnMove.STAND;
}
}
}
