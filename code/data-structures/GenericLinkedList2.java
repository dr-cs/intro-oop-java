publicclassGenericLinkedList2<E>{

privateclassNode{
privateEdata;
privateNodenext;

publicNode(Edata){
this(data,null);
}

publicNode(Edata,Nodenext){
this.data=data;
setNext(next);
}

publicEgetData(){
returndata;
}

publicNodegetNext(){
returnnext;
}

publicvoidsetNext(Nodenext){
this.next=next;
}
}

privateNodefront;

publicGenericLinkedList2(){
front=null;
}

publicvoidaddToFront(Eitem){
front=newNode(item,front);
}

publicEremoveFront(){
if(null==front){
thrownewRuntimeException("Can'tremoveFront()onemptylist.");
}
Eanswer=front.getData();
front=front.getNext();
returnanswer;
}

publicStringtoString(){
StringBuffersb=newStringBuffer("[");
for(Nodenode=front;node!=null;node=node.getNext()){
sb.append(node.getData()+"");
}
returnsb.toString()+"]";
}

publicintlength(){
intlen=0;
Nodenode=front;
while(node!=null){
len++;
node=node.getNext();
}
returnlen;
}

publicintlength2(){
intlen=0;
for(Nodenode=front;node!=null;node=node.getNext(),len++);
returnlen;
}

publicvoidinsertAfter(EexistingItem,EnewItem){
NodecurNode=front;
while(!curNode.getData().equals(existingItem)&&
(curNode.getNext()!=null)){
curNode=curNode.getNext();
}
NodenewNode=newNode(newItem,curNode.getNext());
curNode.setNext(newNode);
}

publicstaticvoidmain(String[]args){
GenericLinkedList2<String>lst=newGenericLinkedList2<>();
lst.addToFront("Thorny");
lst.addToFront("Farva");
lst.addToFront("Mac");
lst.addToFront("Rabbit");
lst.addToFront("Foster");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());

lst.insertAfter("Rabbit","Ursula");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
lst.insertAfter("Spreaditon!","Chimpo");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
}
}
