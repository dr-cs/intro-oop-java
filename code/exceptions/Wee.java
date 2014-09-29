publicclassWee{

staticvoidbar(){//throwsThrowable{
thrownewRuntimeException("Wee!");
}

staticvoidfoo(){//throwsThrowable{
bar();
System.out.println("Foo!");
}

publicstaticvoidmain(String[]args){//throwsThrowable{
foo();
//try{
//foo();
//System.out.println("Afterthefoo()call.");
//}catch(Throwablet){
//System.out.println(t.getMessage());
//}
System.out.println("I'mstillrunning.");
}
}
