importjavax.swing.JFileChooser;
importjavax.swing.ListModel;
importjavax.swing.DefaultListModel;
importjavax.swing.JFrame;
importjava.io.File;

publicclassCompanyGui{

publicstaticvoidmain(String[]args)throwsException{
FilethisDir=newFile(System.getProperty("user.dir"));
JFileChooserchooser=newJFileChooser(thisDir);
intreturnVal=chooser.showOpenDialog(null);
if(returnVal==JFileChooser.APPROVE_OPTION){
Filefile=chooser.getSelectedFile();
Companycompany=newCompany(file);
DefaultListModellm=newDefaultListModel();
for(Employeee:company.getEmployees()){
lm.addElement(e);
}
CompanyFramecf=newCompanyFrame(lm);
cf.pack();
cf.setVisible(true);
}

}
}
