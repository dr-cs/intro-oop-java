publicabstractclassAbstractStack<E>implementsStack<E>{

publicfinalEpop(){
if(isEmpty()){
thrownewjava.util.EmptyStackException();
}
returnremoveNext();
}

protectedabstractEremoveNext();
}
