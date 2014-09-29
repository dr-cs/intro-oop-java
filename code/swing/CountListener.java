importjava.awt.event.ActionListener;
importjava.awt.event.ActionEvent;
importjavax.swing.JLabel;

publicclassCountListenerimplementsActionListener{

privateJLabelcountLabel;
privateintcount;

publicCountListener(JLabelcountLabel){
this.countLabel=countLabel;
count=0;
}

publicvoidactionPerformed(ActionEvente){
count++;
countLabel.setText("Count:"+count);
}
}
