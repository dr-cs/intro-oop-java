publicclassPartialIntArray{

privateint[]elements;
privateintsize;


publicPartialIntArray(){
this(10);
}

publicPartialIntArray(intinitialCapacity){
if(initialCapacity<0)
thrownewIllegalArgumentException("IllegalCapacity:"+
initialCapacity);
this.elements=newint[initialCapacity];
}

publicvoidadd(inte){
if(size>=elements.length){
int[]resizedArray=newint[elements.length*2];
for(inti=0;i<elements.length;i++){

}
}

elements[size++]=e;
}

publicintget(intindex){
if(index<0||index>=size){
//...
}
returnelements[index];
}

publicintsize(){
returnthis.size;
}

publicstaticvoidmain(String[]args){
PartialIntArraypia=newPartialIntArray();
pia.add(2);
pia.add(4);
pia.add(6);
for(inti=0;i<pia.size();i++){
System.out.println(pia.get(i));
}
pia.get(10);
}

}
