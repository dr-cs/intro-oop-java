importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjava.awt.BorderLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;

publicclassBadListenerextendsJFrameimplementsActionListener{

publicBadListener(){
super("Bad");
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButtonhelloButton=newJButton("Hello");
helloButton.addActionListener(this);
JButtongoodByeButton=newJButton("Goodbye");
goodByeButton.addActionListener(this);
add(helloButton,BorderLayout.NORTH);
add(goodByeButton,BorderLayout.SOUTH);
}

publicvoidactionPerformed(ActionEvente){
Stringbutton=e.getActionCommand();
if(button.equals("Hello")){
System.out.println("Hellowasperssed.");
}elseif(button.equals("Goodbye")){
System.out.println("Goodbyewasperssed.");
}
}

publicstaticvoidmain(String[]args){
BadListenerbad=newBadListener();
bad.pack();
bad.setVisible(true);
}
}
