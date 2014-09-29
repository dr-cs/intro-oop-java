importjava.util.ArrayList;

publicclassDoberman{

publicstaticStringSTD_DOBIE_SIZE="large";

privatestaticintdobieCount=0;

privateStringname;

publicDoberman(Stringname){
this.name=name;
dobieCount++;
}

publicStringreportDobieCount(){
returnname+"saysthereare"+dobieCount+"dobies.";
}

publicbooleanequals(Dobermanother){
if(null==other){returnfalse;}
if(this==other){returntrue;}
if(!(otherinstanceofDoberman)){returnfalse;}
returnthis.name.equals(((Doberman)other).name);
}

publicstaticvoidmain(String[]args){
ArrayListdaringDobermans=newArrayList();
daringDobermans.add(newDoberman("Chloe"));
System.out.println(daringDobermans.contains(newDoberman("Chloe")));
Dobermand=null;
System.out.println(d.toString());
}
}
