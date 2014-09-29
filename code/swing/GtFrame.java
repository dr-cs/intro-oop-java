importjava.awt.BorderLayout;
importjava.awt.Color;
importjava.awt.Font;
importjava.awt.Graphics;
importjavax.swing.JButton;
importjavax.swing.JFrame;

publicclassGtFrameextendsJFrame{

publicGtFrame(){
super("GoTech!");
setSize(400,300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().setBackground(Color.WHITE);
add(newJButton("Button"),BorderLayout.SOUTH);
}

publicvoidpaint(Graphicsg){
super.paint(g);
g.setColor(newColor(207,181,59));
g.drawArc(75,50,250,200,20,340);
g.drawLine(275,150,375,150);
g.drawLine(325,150,325,250);
g.setFont(newFont("Helvetica",Font.BOLD,24));
g.drawString("GoTech!",150,275);
}

publicstaticvoidmain(String[]args){
GtFramegtf=newGtFrame();
gtf.setVisible(true);
}
}
