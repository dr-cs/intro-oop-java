importjavax.swing.JFrame;
importjavax.swing.JLabel;
importjavax.swing.JButton;
importjava.awt.BorderLayout;
importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;

publicclassGreetingGuiextendsJFrameimplementsActionListener{

privateJLabelgreetingLabel;

publicGreetingGui(){
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
greetingLabel=newJLabel("Greetingwillgohere.");
JButtonbutton=newJButton("Greet!");
button.addActionListener(this);

add(greetingLabel,BorderLayout.CENTER);
add(button,BorderLayout.SOUTH);
pack();
}

publicvoidactionPerformed(ActionEvente){
Greetergreeter=newGreeter("bob");
Stringgreeting=greeter.greet();
greetingLabel.setText(greeting);
}

publicstaticvoidmain(String[]args){
GreetingGuigg=newGreetingGui();
gg.setVisible(true);
}
}
