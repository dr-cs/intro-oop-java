publicclassArrayParameters{

privateint[]years;

publicArrayParameters(){
//Notethatwecan'tdothis,becauseithastobedoneatdeclaration
//importantYears={1968,1990,2012;
years=newint[3];
years[0]=1968;
years[1]=1990;
years[2]=2012;
}

publicStringtoString(){
StringBuffersb=newStringBuffer();
sb.append("Importantyears:");
for(intyear:years){
sb.append(year+"");
}
returnsb.toString();
}

publicint[]getYears(){
returnyears;
}

privatevoidmodifyElement(int[]array,intindex,intnewValue){
array[index]=newValue;
}

publicstaticint[]copyOf(int[]sourceArray){
int[]newArray=newint[sourceArray.length];
for(inti=0;i<newArray.length;++i){
newArray[i]=sourceArray[i];
}
returnnewArray;
}

publicstaticStringasString(int[]array){
StringBuffersb=newStringBuffer();
for(intelement:array){
sb.append(element+"");
}
returnsb.toString();
}

publicstaticvoidmain(String[]args){
ArrayParametersap=newArrayParameters();
System.out.println("Initialvalues:");
System.out.println(ap);
System.out.println("Afterap.modifyElement(ap.getYears(),2,2013);");
ap.modifyElement(ap.getYears(),2,2013);
System.out.println(ap);

//Toavoidmodifyingoriginalarray,makeacopy
int[]a={1,2,3};
int[]b=copyOf(a);
int[]c=a;
c[2]=66;
b[2]=42;//Thisdoesn'tmodifya,becuasebisadifferentarray
System.out.println(asString(a));
System.out.println(asString(b));
System.out.println(asString(c));
}
}
