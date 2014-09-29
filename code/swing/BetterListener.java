importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjava.awt.BorderLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;

publicclassBetterListenerextendsJFrame{

privateclassHelloListenerimplementsActionListener{
publicvoidactionPerformed(ActionEvente){
System.out.println("Hellowaspressed.");
}
}

privateclassGoodByeListenerimplementsActionListener{
publicvoidactionPerformed(ActionEvente){
System.out.println("Goodbyewaspressed.");
}
}

publicBetterListener(){
super("BetterListener");
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButtonhelloButton=newJButton("Hello");
helloButton.addActionListener(newHelloListener());
JButtongoodByeButton=newJButton("Goodbye");
goodByeButton.addActionListener(newGoodByeListener());
add(helloButton,BorderLayout.NORTH);
add(goodByeButton,BorderLayout.SOUTH);
}


publicstaticvoidmain(String[]args){
BetterListenerbetter=newBetterListener();
better.pack();
better.setVisible(true);
}
}
