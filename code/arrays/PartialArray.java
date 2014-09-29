publicclassPartialIntArray{

privateint[]elementData;
privateintsize;

publicPartialIntArray(intinitialCapacity){
if(initialCapacity<0)
thrownewIllegalArgumentException("IllegalCapacity:"+
initialCapacity);
this.elementData=newint[initialCapacity];
}

publicArrayList(){
this(10);
}

//...
}
