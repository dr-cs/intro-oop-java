importjava.util.Scanner;

publicclassBlackjack{

privatestaticvoiddealFaceDown(Deckdeck,Playerplayer){
player.getHand().addFaceDown(deck.draw());
}

privatestaticvoiddealFaceUp(Deckdeck,Playerplayer){
player.getHand().addFaceUp(deck.draw());
}

privatestaticvoidprintHands(BlackjackHand...hands){
for(BlackjackHandhand:hands){
hand.toString();
}
}

publicstaticvoidmain(String[]args){
Playerdealer=newRandomPlayer("Dealer");
Scannerkbd=newScanner(System.in);
System.out.print("What'syourname?");
Stringname=kbd.nextLine();
Playerplayer=newHumanPlayer(name);
Deckdeck=newDeck();
deck.shuffle();
dealFaceDown(deck,dealer);
dealFaceDown(deck,player);
dealFaceUp(deck,dealer);
dealFaceUp(deck,player);
booleanshouldKeepPlaying=true;
while(shouldKeepPlaying){
System.out.println("Here'sthetable:");
printHands(dealer.getHand(),player.getHand());
Player.MoveplayerMove=player.getMove(dealer.getHand());
dealer.getMove(player.getHand());
if(playerMove==Player.Move.STAND){
shouldKeepPlaying=false;
}
}
}
}
