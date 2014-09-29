importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;
importjava.awt.GridLayout;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JLabel;

publicclassCounterGridextendsJFrame{


privateclassCountListenerimplementsActionListener{
intcount=0;

publicvoidactionPerformed(ActionEvente){
System.out.println(count++);
}
}

publicCounterGrid(){
super("Counter");
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLayout(newGridLayout(3,1));//3rows,1column

JButtonexitButton=newJButton("Exit");
exitButton.addActionListener(newExitListener());

JLabelcounterLabel=newJLabel("Count:0");
JButtoncounterButton=newJButton("Incrementcount");
counterButton.addActionListener(newCountListener());

add(counterButton);
add(counterLabel);
add(exitButton);

setSize(200,300);
}

publicstaticvoidmain(String[]args){
CounterGridcf=newCounterGrid();
cf.setVisible(true);
}
}
