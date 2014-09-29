importjava.util.Arrays;
importjava.util.Iterator;

publicclassDynamicArray<E>implementsIterable<E>{

privateclassDynamicArrayIteratorimplementsIterator<E>{
privateintcursor=0;

publicbooleanhasNext(){
returncursor<=lastIndex;
}

publicEnext(){
Eanswer=get(cursor);
cursor++;
returnanswer;
}

publicvoidremove(){
DynamicArray.this.remove(cursor-1);
}
}

privateObject[]elements;
privateintlastIndex;

publicDynamicArray(){
this(10);
}

publicDynamicArray(intcapacity){
this.elements=newObject[capacity];
lastIndex=-1;
}

publicIterator<E>iterator(){
returnnewDynamicArrayIterator();
}

publicvoidadd(Eitem){
if(lastIndex==elements.length-1){
//Note:thisissimplistic.Inproductioncodewe'dwantto
//guardagainstoverflow
intnewCapacity=elements.length*2;
elements=Arrays.copyOf(elements,newCapacity);
}
elements[++lastIndex]=item;
}

publicEget(intindex){
if((index<0)||(index>lastIndex)){
thrownewIndexOutOfBoundsException(newInteger(index).toString());
}
return(E)elements[index];
}

publicvoidset(intindex,Eitem){
elements[index]=item;
}

publicintsize(){
returnlastIndex+1;
}

publicEremove(intindex){
EremovedItem=(E)elements[index];
for(inti=index+1;i<=lastIndex;i++){
elements[i-1]=elements[i];
}
lastIndex--;
returnremovedItem;
}

publicstaticvoidmain(String[]args){
DynamicArray<String>da=newDynamicArray<>(2);
da.add("Stan");
da.add("Kenny");
//Automaticallygrowingcapacity
da.add("Cartman");
System.out.println("dacontents:");
//Usingindexed-basedaccess:
for(inti=0;i<da.size();++i){
System.out.println(da.get(i));
}
System.out.println("YoukilledKenny!");
IteratordaIter=da.iterator();
while(daIter.hasNext()){
if(daIter.next().equals("Kenny")){
daIter.remove();
}
}
//Usingiterator:
for(Stringe:da){
System.out.println(e);
}
}
}
