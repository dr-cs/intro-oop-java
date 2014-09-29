importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;
importjava.awt.BorderLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JLabel;

publicclassCounterWindow{

publicstaticvoidmain(String[]args){
JFramemainFrame=newJFrame("Counter");
mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
mainFrame.setLayout(newBorderLayout());

JButtonexitButton=newJButton("Exit");
exitButton.addActionListener(newExitListener());

JLabelcounterLabel=newJLabel("Count:0");
JButtoncounterButton=newJButton("Incrementcount");
counterButton.addActionListener(newCountListener(counterLabel));

mainFrame.add(counterButton,BorderLayout.NORTH);
mainFrame.add(counterLabel,BorderLayout.CENTER);
mainFrame.add(exitButton,BorderLayout.SOUTH);

mainFrame.setSize(200,300);
mainFrame.setVisible(true);
}
}
