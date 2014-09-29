importjava.util.ArrayList;

publicclassLinkedQueue<E>{

privateclassNode<E>{
Edata;
Node<E>next;

Node(Edata,Node<E>next){
this.data=data;
this.next=next;
}
}

privateNode<E>head;
privateNode<E>last;

publicvoidenqueue(Eitem){
Node<E>newNode=newNode<E>(item,null);
if(null==head)head=newNode;
if(null!=last)last.next=newNode;
last=newNode;
}

publicEdequeue(){
Eanswer=head.data;
head=head.next;
returnanswer;
}

publicbooleanisEmpty(){
return(head==null);
}


publicstaticvoidmain(String[]args){
LinkedQueue<Integer>ints=newLinkedQueue<>();
ints.enqueue(1);
ints.enqueue(2);
ints.enqueue(3);
System.out.println(ints.dequeue());
System.out.println(ints.dequeue());
System.out.println(ints.dequeue());
}
}
