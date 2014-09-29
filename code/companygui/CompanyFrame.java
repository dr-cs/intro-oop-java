importjava.awt.BorderLayout;
importjava.awt.event.ActionEvent;
importjava.awt.event.ActionListener;
importjavax.swing.Box;
importjavax.swing.BoxLayout;
importjavax.swing.DefaultListModel;
importjavax.swing.JButton;
importjavax.swing.JFrame;
importjavax.swing.JList;
importjavax.swing.JPanel;
importjavax.swing.JScrollPane;
importjavax.swing.ListModel;

publicclassCompanyFrameextendsJFrame{

privateDefaultListModelemployeeListModel;

publicCompanyFrame(DefaultListModelemployeeListModel){
super("CompanyGUI");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.employeeListModel=employeeListModel;
setLayout(newBorderLayout());
add(newJScrollPane(newJList(employeeListModel)),BorderLayout.CENTER);
add(createButtonPanel(),BorderLayout.SOUTH);
}

privateJPanelcreateButtonPanel(){
JButtonnewSalariedEmpButton=newJButton("NewSalariedEmployee...");
newSalariedEmpButton.addActionListener(newActionListener(){
publicvoidactionPerformed(ActionEvente){
SalariedEmployeeDialogsed=
newSalariedEmployeeDialog(CompanyFrame.this);
if(sed.showDialog()){
employeeListModel.addElement(sed.getEmployee());
}
}
});
JButtonnewHourlyEmpButton=newJButton("NewHourlyEmployee...");
newHourlyEmpButton.addActionListener(newActionListener(){
publicvoidactionPerformed(ActionEvente){
HourlyEmployeeDialoghed=
newHourlyEmployeeDialog(CompanyFrame.this);
if(hed.showDialog()){
employeeListModel.addElement(hed.getEmployee());
}
}
});


JPanelpanel=newJPanel();
panel.setLayout(newBoxLayout(panel,BoxLayout.X_AXIS));
panel.add(Box.createHorizontalGlue());
panel.add(newSalariedEmpButton);
panel.add(newHourlyEmpButton);
panel.add(Box.createHorizontalGlue());
returnpanel;
}

}
