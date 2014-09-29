importjava.util.Scanner;

publicclassHumanPlayerextendsBlackjackPlayer{

Scannerkeyboard;

publicHumanPlayer(Stringname){
super(name);
keyboard=newScanner(System.in);
}

publicMovegetMove(BlackjackHand...opponentHands){
System.out.print("What'syourmove,"+getName()
+"?(Hforhit,Sforstand,thenENTER)");
Stringinput=keyboard.nextLine();
if(input.equals("h")||input.equals("H")){
returnMove.HIT;
}else{
returnMove.STAND;
}
}
}
