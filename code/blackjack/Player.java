publicabstractclassPlayer{

publicenumMove{HIT,STAND};

privateStringname;
protectedBlackjackHandhand;

publicPlayer(StringaName){
name=aName;
hand=newBlackjackHand();
}

publicStringgetName(){
returnname;
}

publicBlackjackHandgetHand(){
returnhand;
}

publicvoiddealFaceUp(PlayingCardcard){
hand.addFaceUp(card);
}

publicvoiddealFaceDown(PlayingCardcard){
hand.addFaceDown(card);
}

publicabstractMovegetMove(BlackjackHand...otherHands);
}
