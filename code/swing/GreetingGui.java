importjavax.swing.JFrame;
importjavax.swing.JLabel;
importjavax.swing.JButton;
importjava.awt.BorderLayout;
importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;

publicclassGreetingGuiextendsJFrame{

privateJLabelgreetingLabel;

privateclassGreetButtonListenerimplementsActionListener{
privateJLabelgreetingLabel;

publicGreetButtonListener(JLabelgreetingLabel){
this.greetingLabel=greetingLabel;
}

publicvoidactionPerformed(ActionEvente){
Greetergreeter=newGreeter("bob");
Stringgreeting=greeter.greet();
greetingLabel.setText(greeting);
}
}

publicGreetingGui(){
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
greetingLabel=newJLabel("Greetingwillgohere.");
JButtonbutton=newJButton("Greet!");
button.addActionListener(newGreetButtonListener(greetingLabel));

add(greetingLabel,BorderLayout.CENTER);
add(button,BorderLayout.SOUTH);
pack();
}


publicstaticvoidmain(String[]args){
GreetingGuigg=newGreetingGui();
gg.setVisible(true);
}
}
