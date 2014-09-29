publicclassMethods{

staticStringmessage="Globalmessage.";
staticinta=5;

publicstaticintadd(inta,intb){
Stringmessage="Adding"+a+"and"+b;
System.out.println(message);
returna+b;
}

publicstaticvoidmain(String[]args){
intx=1;
inty=2;
//Whatifweremovedtheextraparenthesesaround(x+y)?
//System.out.println("x+y="+(x+y));
System.out.println("x+add(x,y)="+(x+add(x,y)));
}

}
