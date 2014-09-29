publicclassShortCircuit{

privatestaticintcounter=0;

privatestaticbooleanincrementCounter(){
counter++;
returntrue;
}

publicstaticvoidmain(Stringargs[]){
booleana=true;
booleanb=false;
if(a||incrementCounter()){
System.out.println("Evaluated(a!!incrementCounter()).");
}
System.out.println("Counter="+counter);
if(a&&incrementCounter()){
System.out.println("Evaluated(a&&incrementCounter()).");
}
System.out.println("Counter="+counter);
}
}
