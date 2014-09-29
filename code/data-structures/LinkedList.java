publicclassLinkedList{

privateclassNode{
Objectdata;
Nodenext;

publicNode(Objectdata,Nodenext){
this.data=data;
this.next=next;
}
}

privateNodehead;

/**
*Addanewitemtotheheadofthislist.
*/
publicvoidadd(Objectitem){
head=newNode(item,head);
}

/**
*Returntheitemattheheadofthislistandremoveitfromthislist.
*/
publicObjectremoveHead(){
if(null==head){
thrownewRuntimeException("Can'tremoveHead()onemptylist.");
}
Objectanswer=head.data;
head=head.next;
returnanswer;
}

/**
*Thenumberofitemsinthislist.Seeslide9.
*/
publicintlength(){
intlen=0;
Nodenode=head;
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
StringBuildersb=newStringBuilder("[");
for(Nodenode=head;node!=null;node=node.next){
sb.append(node.data+"");
}
returnsb.toString()+"]";
}


//Seeslide8
publicvoidinsertAfter(ObjectexistingItem,ObjectnewItem){
NodecurNode=head;
while(!curNode.data.equals(existingItem)&&
(curNode.next!=null)){
curNode=curNode.next;
}
NodenewNode=newNode(newItem,curNode.next);
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
lst.insertAfter("WonderWoman","Chimpo");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
}
}
