publicclassShout{

publicstaticvoidmain(String[]args){
System.out.println("Thecommandlineargumentsare:");
for(inti=0;i<args.length;i++){
System.out.println("args["+i+"]="+args[i]);
}

System.out.println("NowI'mgonnashoutthemtoyou:");
for(Stringarg:args){
System.out.print(arg.toUpperCase()+"");
}
System.out.println();
}
}
