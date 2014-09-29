importjava.awt.BorderLayout;
importjava.awt.Graphics;
importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjava.awt.event.WindowAdapter;
importjava.awt.event.WindowEvent;
importjavax.swing.Box;
importjavax.swing.BoxLayout;
importjavax.swing.ImageIcon;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JLabel;
importjavax.swing.JOptionPane;

publicclassJackextendsJFrame{

privateJLabelimageLabel;

privateclassJackWindowListenerextendsWindowAdapter{

publicvoidwindowClosing(WindowEvente){
intchoice=JOptionPane.showConfirmDialog(
Jack.this,
"Doyoureallywanttoexit?",
"Exitforreals?",
JOptionPane.OK_CANCEL_OPTION
);
if(choice==JOptionPane.YES_OPTION){
System.exit(0);
}
}
}

publicJack(){
//NeedtosetDO_NOTHING_ON_CLOSEsowecanhandlewindowclosing
setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

//Confirmexitbeforeexitingprogram
addWindowListener(newJackWindowListener());
imageLabel=newJLabel();

add(imageLabel,BorderLayout.CENTER);
add(createButtonBox(),BorderLayout.SOUTH);
pack();
}

privateBoxcreateButtonBox(){
JButtonjackButton=newJButton("ShowJackofHearts");
ImageIconbuttonIcon=newImageIcon("New16.gif");
jackButton.setIcon(buttonIcon);

ActionListenerjackListener=newActionListener(){
publicvoidactionPerformed(ActionEvente){
ImageIconjackIcon=newImageIcon("JACK-HEARTS.png");
imageLabel.setIcon(jackIcon);
pack();
}
};
jackButton.addActionListener(jackListener);

BoxbuttonBox=newBox(BoxLayout.X_AXIS);
buttonBox.add(jackButton);
returnbuttonBox;
}

publicstaticvoidmain(String[]args){
Jackj=newJack();
j.setVisible(true);
}
}
