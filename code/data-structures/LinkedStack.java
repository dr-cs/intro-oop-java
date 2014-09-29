publicclassLinkedStack<E>extendsAbstractStack<E>{

privateclassNode<E>{
Edata;
Node<E>next;

Node(Edata,Node<E>next){
this.data=data;
this.next=next;
}
}

privateNode<E>head;

publicvoidpush(Eitem){
head=newNode<E>(item,head);
}

publicEremoveNext(){
Eanswer=head.data;
head=head.next;
returnanswer;
}

publicbooleanisEmpty(){
return(head==null);
}

publicstaticvoidmain(String[]args){
LinkedStack<Integer>ints=newLinkedStack<>();
ints.push(1);
ints.push(2);
ints.push(3);

System.out.println(ints.pop());
System.out.println(ints.pop());
System.out.println(ints.pop());
System.out.println(ints.pop());
}
}
