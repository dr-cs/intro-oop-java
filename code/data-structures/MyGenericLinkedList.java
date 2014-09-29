publicclassMyGenericLinkedList<E>{

privateclassNode<E>{
Edata;
Node<E>next;

publicNode(Edata,Node<E>next){
this.data=data;
this.next=next;
}
}

privateNode<E>head;

/**
*Addanewitemtotheheadofthislist.
*/
publicvoidadd(Eitem){
head=newNode<>(item,head);
}

/**
*Returntheitemattheheadofthislistandremoveitfromthislist.
*/
publicEremoveHead(){
if(null==head){
thrownewRuntimeException("Can'tremoveHead()onemptylist.");
}
Eanswer=head.data;
head=head.next;
returnanswer;
}

/**
*Thenumberofitemsinthislist.
*/
publicintlength(){
intlen=0;
Node<E>node=head;
while(node!=null){
len++;
node=node.next;
}
returnlen;
}

/**
*@returntrueifthislisthasnoelements,falseotherwise.
*/
publicbooleanisEmpty(){
returnhead==null;
}

publicStringtoString(){
StringBuffersb=newStringBuffer("[");
for(Node<E>node=head;node!=null;node=node.next){
sb.append(node.data+"");
}
returnsb.toString()+"]";
}

publicvoidinsertAfter(EexistingItem,EnewItem){
Node<E>curNode=head;
while(!curNode.data.equals(existingItem)&&
(curNode.next!=null)){
curNode=curNode.next;
}
Node<E>newNode=newNode<E>(newItem,curNode.next);
curNode.next=newNode;
}

publicstaticvoidmain(String[]args){
LinkedListlst=newLinkedList();
lst.add("Thorny");
lst.add("Farva");
lst.add("Mac");
lst.add("Rabbit");
lst.add("Foster");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());

//Insertafterexistingitem
lst.insertAfter("Rabbit","Ursula");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());

//Insertafternon-existingitem-goestotailoflist
lst.insertAfter("Spreaditon!","Chimpo");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
}
}
