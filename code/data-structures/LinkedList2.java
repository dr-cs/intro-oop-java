publicclassLinkedList{

privateclassNode{
Objectdata;
Nodenext;

publicNode(Objectdata,Nodenext){
this.data=data;
this.next=next;
}
}

privateNodefront;

/**
*Addanewitemtothefrontofthislist.
*/
publicvoidaddFront(Objectitem){
front=newNode(item,front);
}

/**
*Returntheitematthefrontofthislistandremoveitfromthislist.
*/
publicObjectremoveFront(){
if(null==front){
thrownewRuntimeException("Can'tremoveFront()onemptylist.");
}
Objectanswer=front.data;
front=front.next;
returnanswer;
}

/**
*Thenumberofitemsinthislist.
*/
publicintlength(){
intlen=0;
Nodenode=front;
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
returnfront==null;
}

publicStringtoString(){
StringBuffersb=newStringBuffer("[");
for(Nodenode=front;node!=null;node=node.next){
sb.append(node.data+"");
}
returnsb.toString()+"]";
}

publicvoidinsertAfter(ObjectexistingItem,ObjectnewItem){
NodecurNode=front;
while(!curNode.data.equals(existingItem)&&
(curNode.next!=null)){
curNode=curNode.next;
}
NodenewNode=newNode(newItem,curNode.next);
curNode.next=newNode;
}

publicstaticvoidmain(String[]args){
LinkedListlst=newLinkedList();
lst.addFront("Thorny");
lst.addFront("Farva");
lst.addFront("Mac");
lst.addFront("Rabbit");
lst.addFront("Foster");
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
