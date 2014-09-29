publicclassDoublyLinkedList<E>{

privateclassNode<E>{
Edata;
Node<E>next;
Node<E>previous;

publicNode(Edata,Node<E>next,Node<E>previous){
this.data=data;
this.next=next;
this.previous=previous;
}
}

privateNode<E>first;
privateNode<E>last;

publicDoublyLinkedList(){
first=null;
last=null;
}

publicvoidaddFront(Eitem){
first=newNode<E>(item,first,null);
Node<E>second=first.next;
if(second!=null){
//Therewasalreadyatleatonenode
second.previous=first;
}else{
//Thisisthefirstaddition,lastandfirstaresame
last=first;
}
}

publicEremoveFront(){
if(null==first){
thrownewRuntimeException("Can'tremoveFront()onemptylist.");
}
Eanswer=first.data;
first=first.next;
first.previous=null;
returnanswer;
}

publicEremoveBack(){
if(null==last){
thrownewRuntimeException("Can'tremoveBack()onemptylist.");
}
Eanswer=last.data;
last=last.previous;
last.next=null;
returnanswer;
}

publicvoidremove(inti){
if(first==null){
return;
}
if(i==0){
first=first.next;
first.previous=null;
}else{
Node<E>node=first;
while(i>0&&node.next!=null){
node=node.next;
i--;
}
if(i==0){
if(last==node){
last=node.previous;
last.next=null;
}else{
node.previous.next=node.next;
node.next.previous=node.previous;
}
}
}
}

publicStringtoString(){
StringBuffersb=newStringBuffer("[");
for(Nodenode=first;node!=null;node=node.next){
sb.append(node.data+"");

}
returnsb.toString()+"]";
}

publicStringtoReverseString(){
StringBuffersb=newStringBuffer("[");
for(Nodenode=last;node!=null;node=node.previous){
sb.append(node.data+"");
}
returnsb.toString()+"]";
}

publicintlength(){
intlen=0;
Nodenode=first;
while(node!=null){
len++;
node=node.next;
}
returnlen;
}

publicintlength2(){
intlen=0;
for(Nodenode=first;node!=null;node=node.next,len++);
returnlen;
}

publicvoidinsertAfter(EexistingItem,EnewItem){
Node<E>curNode=first;
while(!curNode.data.equals(existingItem)&&
(curNode.next!=null)){
curNode=curNode.next;
}
Node<E>newNode=newNode<E>(newItem,curNode.next,curNode);
if(newNode.next==null){
//Noexistingitem,orexistingitemislast
last=newNode;
}else{
//Insertingbetweentwonodes,setpreviousreference
//innewnextmode
curNode.next.previous=newNode;
}
curNode.next=newNode;
}

publicstaticvoidmain(String[]args){
DoublyLinkedList<String>lst=newDoublyLinkedList<>();
lst.addFront("Thorny");
lst.addFront("Farva");
lst.addFront("Mac");
lst.addFront("Rabbit");
lst.addFront("Foster");
lst.addFront("Ursula");
lst.addFront("Chimpo");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
lst.remove(0);
System.out.println("Afterlst.remove(0):"+lst);
lst.remove(2);
System.out.println("Afterlst.remove(2):"+lst);
lst.remove(4);
System.out.println("Afterlst.remove(4)(lastelement):"+lst);
System.out.println("toReverseStringstillworks:"
+lst.toReverseString());

lst.remove(22);
System.out.println("Afterlst.remove(22):"+lst);
lst.insertAfter("Rabbit","Ursula");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
lst.insertAfter("Spreaditon!","Chimpo");
System.out.println(lst);
System.out.println("Howmany?"+lst.length());
System.out.println("Inreverse:");
System.out.println(lst.toReverseString());
}
}
