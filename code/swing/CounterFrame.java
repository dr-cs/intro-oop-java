importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;
importjava.awt.BorderLayout;
importjava.awt.GridLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JLabel;
importjavax.swing.JPanel;

publicclassCounterFrameextendsJFrame{

publicCounterFrame(){
super("Counter");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButtonexitButton=newJButton("Exit");
exitButton.addActionListener(newExitListener());

JLabelcounterLabel=newJLabel("Count:0");
JButtoncounterButton=newJButton("Incrementcount");
counterButton.addActionListener(newCountListener(counterLabel));

setLayout(newGridLayout(3,1));
add(counterLabel);
add(counterButton);
add(exitButton);

pack();
}

publicstaticvoidmain(String[]args){
CounterFramecf=newCounterFrame();
cf.setVisible(true);
}
}
