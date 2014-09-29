publicclassGenericLinkedList<E>{

privateclassNode<E>{
Edata;
Node<E>next;

publicNode(Edata,Nodenext){
this.data=data;
this.next=next;
}
}

privateNode<E>head;

publicGenericLinkedList(){
head=null;
}

/**
*Addanewitemtothefrontofthislist.
*/
publicvoidaddFront(Eitem){
head=newNode<E>(item,head);
}

/**
*Returntheitematthefrontofthislistandremoveitfromthelist.
*/
publicEremoveFront(){
if(null==head){
thrownewRuntimeException("Can'tremoveFront()onemptylist.");
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
StringBuffersb=newStringBuffer("[");
for(Nodenode=head;node!=null;node=node.next){
sb.append(node.data+"");
}
returnsb.toString()+"]";
}

publicintlength2(){
intlen=0;
for(Node<E>node=head;node!=null;node=node.next,len++);
returnlen;
}

publicvoidinsertAfter(EexistingItem,EnewItem){
Node<E>curNode=head;
while(!curNode.data.equals(existingItem)&&
(curNode.next!=null)){
curNode=curNode.next;
}
Node<E>newNode=newNode(newItem,curNode.next);
curNode.next=newNode;
}

publicEget(intindex){
//Guardcondition:emptylist
if(null==head){returnnull;}
Node<E>curNode=head;
while(index>0){
if(curNode.next==null){
returnnull;
}
curNode=curNode.next;
index--;
}
returncurNode.data;
}

publicbooleanremove(EexistingItem){
//Guardcondition:emptylist
if(null==head){returnfalse;}
booleanwasModified=false;
Node<E>curNode=head;
Node<E>previous=null;
while(!existingItem.equals(curNode.data)&&
(curNode.next!=null)){
previous=curNode;
curNode=curNode.next;
}
if(previous==null){
//removingheadnode
head=curNode.next;
wasModified=true;
}elseif(curNode.data.equals(existingItem)){
previous.next=curNode.next;
wasModified=true;
}
returnwasModified;
}

publicstaticvoidmain(String[]args){
GenericLinkedList<String>lst=newGenericLinkedList<>();
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


System.out.println("get(1):"+lst.get(1));
System.out.println("get(8)(indexoutofbounds):"+lst.get(8));

lst.remove("Foster");
System.out.println("RemovingFoster:"+lst);

lst.remove("Mac");
System.out.println("RemovingMac:"+lst);

lst.remove("Chimpo");
System.out.println("RemovingChimpo:"+lst);

lst.remove("Foo");
System.out.println("RemovingFoo:"+lst);

GenericLinkedList<String>nutherList=newGenericLinkedList<>();
nutherList.remove("Foo");
System.out.println("RemovingFoofromemptylist:"+nutherList);

}
}
