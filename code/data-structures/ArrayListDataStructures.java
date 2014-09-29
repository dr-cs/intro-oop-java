importjava.util.ArrayList;

publicclassArrayListDataStructures{

/**
*LIFOdatastructure.
*/
staticclassStack<E>{
privateArrayList<E>elems=newArrayList<>();

publicvoidpush(Eitem){
elems.add(item);
}

publicEpop(){
returnelems.remove(elems.size()-1);
}

publicbooleanisEmpty(){
returnelems.isEmpty();
}
}

/**
*FIFOdatastructure.
*/
staticclassQueue<E>{
privateArrayList<E>elems=newArrayList<>();

publicvoidenqueue(Eitem){
elems.add(item);
}

publicEdequeue(){
returnelems.remove(0);
}

publicbooleanisEmpty(){
returnelems.isEmpty();
}
}

publicstaticvoidmain(String[]args){
Stack<Integer>ints=newStack<>();

ints.push(1);
ints.push(2);
ints.push(3);

System.out.println(ints.pop());
System.out.println(ints.pop());
System.out.println(ints.pop());
System.out.println(ints.pop());
}
}
