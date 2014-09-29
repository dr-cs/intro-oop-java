importjava.awt.Color;
importjava.awt.GridLayout;
importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjavax.swing.BoxLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JMenuBar;
importjavax.swing.JMenu;
importjavax.swing.JMenuItem;
importjavax.swing.JPanel;

publicclassColorBoxextendsJFrameimplementsActionListener{

JPanelcolorPanel;

publicColorBox(){
super("Color,Box,andNestingDemo");

//Setupbuttonpanel
JButtonredButton=newJButton("Red");
redButton.addActionListener(this);

redButton.setEnabled(false);

JButtonwhiteButton=newJButton("White");
whiteButton.addActionListener(this);
JButtonblueButton=newJButton("Blue");
blueButton.addActionListener(this);
JPanelbuttonPanel=newJPanel();
buttonPanel.setLayout(newBoxLayout(buttonPanel,BoxLayout.Y_AXIS));
buttonPanel.add(redButton);
buttonPanel.add(whiteButton);
buttonPanel.add(blueButton);

//Setupcolorpanel
colorPanel=newJPanel();
colorPanel.setSize(200,200);

//Setupmainapplicationframe
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(newGridLayout(1,2));
add(buttonPanel);
add(colorPanel);

JMenuBarmenuBar=createJMenuBar();
setJMenuBar(menuBar);
}

privateJMenuBarcreateJMenuBar(){
JMenuItemredMenuItem=newJMenuItem("Rot");
redMenuItem.addActionListener(this);
redMenuItem.setActionCommand("Red");
JMenuItemwhiteMenuItem=newJMenuItem("Weiss");
whiteMenuItem.addActionListener(this);
JMenuItemblueMenuItem=newJMenuItem("Blau");
blueMenuItem.addActionListener(this);

JMenucolorMenu=newJMenu("Color");
colorMenu.add(redMenuItem);
colorMenu.add(whiteMenuItem);
colorMenu.add(blueMenuItem);

JMenuBarmenuBar=newJMenuBar();
menuBar.add(colorMenu);
returnmenuBar;
}

privateJButtoncreateButton(Stringlabel,ActionListenerlistener){
JButtonbutton=newJButton(label);
button.addActionListener(listener);
returnbutton;
}

publicvoidactionPerformed(ActionEvente){
Stringbutton=e.getActionCommand();
if(button=="Red"){
colorPanel.setBackground(Color.RED);
}elseif(button=="White"){
colorPanel.setBackground(Color.WHITE);
}elseif(button=="Blue"){
colorPanel.setBackground(Color.BLUE);
}
}

publicstaticvoidmain(String[]args){
ColorBoxcb=newColorBox();
cb.pack();
cb.setVisible(true);
}
}
