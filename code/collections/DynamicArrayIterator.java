importjava.util.Iterator;

publicclassDynamicArrayIterator<E>implementsIterator<E>{

privateintcursor=0;
privateDynamicArray<E>da;

publicDynamicArrayIterator(DynamicArray<E>da){
this.da=da;
}

publicbooleanhasNext(){
if(cursor>=da.size()-1){
returnfalse;
}
returntrue;
}

publicEnext(){
Eanswer=da.get(cursor);
cursor++;
returnanswer;
}

publicvoidremove(){
da.remove(cursor-1);
}
}
