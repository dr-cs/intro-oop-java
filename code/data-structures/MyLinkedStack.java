publicclassMyLinkedStack<TextendsPerson>{
privateLinkedList<T>list;

publicMyLinkedStack(){
list=newLinkedList<T>();
}

publicvoidpush(Titem){
list.addFront(item);
}

publicTpop(){
returnlist.removeFront();
}

publicstaticvoidmain(String[]args){
MyLinkedStack<String>stack=newMyLinkedStack<>();
}
}
