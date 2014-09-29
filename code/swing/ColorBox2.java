importjava.awt.Color;
importjava.awt.GridLayout;
importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjavax.swing.AbstractAction;
importjavax.swing.Action;
importjavax.swing.BoxLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JMenuBar;
importjavax.swing.JMenu;
importjavax.swing.JMenuItem;
importjavax.swing.JPanel;

publicclassColorBox2extendsJFrame{

privateJPanelcolorPanel;
privateActionredAction;
privateActionwhiteAction;
privateActionblueAction;

privateclassRedActionextendsAbstractAction{
publicRedAction(){
super("Red");
}

publicvoidactionPerformed(ActionEvente){
colorPanel.setBackground(Color.RED);
}
}

publicColorBox2(){
super("Color,Box,andNestingDemo");

initActions();

//Setupcolorpanel
colorPanel=newJPanel();
colorPanel.setSize(200,200);

//Setupmainapplicationframe
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Gridlayoutwith1row,2columns
setLayout(newGridLayout(1,2));
add(createButtonPanel());
add(colorPanel);
setJMenuBar(createJMenuBar());
redAction.setEnabled(false);
}

privatevoidinitActions(){
redAction=newRedAction();
whiteAction=newAbstractAction("Weiss"){
publicvoidactionPerformed(ActionEvente){
colorPanel.setBackground(Color.WHITE);
}
};
blueAction=newAbstractAction("Blue"){
publicvoidactionPerformed(ActionEvente){
colorPanel.setBackground(Color.BLUE);
}
};
}

privateJPanelcreateButtonPanel(){
JButtonredButton=newJButton(redAction);
JButtonwhiteButton=newJButton(whiteAction);
JButtonblueButton=newJButton(blueAction);

JPanelbuttonPanel=newJPanel();
buttonPanel.setLayout(newBoxLayout(buttonPanel,BoxLayout.Y_AXIS));
buttonPanel.add(redButton);
buttonPanel.add(whiteButton);
buttonPanel.add(blueButton);

returnbuttonPanel;
}

privateJMenuBarcreateJMenuBar(){
JMenuItemredMenuItem=newJMenuItem(redAction);
JMenuItemwhiteMenuItem=newJMenuItem(whiteAction);
JMenuItemblueMenuItem=newJMenuItem(blueAction);

JMenucolorMenu=newJMenu("Color");
colorMenu.add(redMenuItem);
colorMenu.add(whiteMenuItem);
colorMenu.add(blueMenuItem);

JMenuBarmenuBar=newJMenuBar();
menuBar.add(colorMenu);
returnmenuBar;
}

publicstaticvoidmain(String[]args){
ColorBox2cb=newColorBox2();
cb.pack();
cb.setVisible(true);
}
}
