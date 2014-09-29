importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;
importjava.awt.FlowLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JLabel;

publicclassHelloButtons{

publicstaticvoidmain(String[]args){
JFramemainFrame=newJFrame("Hello,buttons!");
mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
mainFrame.setLayout(newFlowLayout());

JButtonexitButton=newJButton("Exit");
exitButton.addActionListener(newExitListener());

JLabelcounterLabel=newJLabel("Count:0");

JButtoncounterButton=newJButton("Incrementcount");
CountListenercl=newCountListener(counterLabel);
counterButton.addActionListener(cl);

mainFrame.add(exitButton);
mainFrame.add(counterButton);
mainFrame.add(counterLabel);
mainFrame.pack();
mainFrame.setVisible(true);
}
}
