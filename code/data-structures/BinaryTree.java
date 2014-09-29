importjava.util.ArrayList;

importjava.util.Iterator;
importjava.util.List;
importjava.util.NoSuchElementException;

publicclassBinaryTree<EextendsComparable<E>>implementsIterable<E>{

privateclassNode<E>{
Eitem;
Node<E>left;
Node<E>right;

Node(Eitem,Node<E>left,Node<E>right){
this.item=item;
this.left=left;
this.right=right;
}
}

privateclassInOrderIterator<E>implementsIterator<E>{

Node<E>curNode;
//fringeistheto-dolistofunvisitednodes.
Stack<Node<E>>fringe;

publicInOrderIterator(Node<E>root){
curNode=root;
fringe=newLinkedStack<>();
}

publicbooleanhasNext(){
return(curNode!=null)||!fringe.isEmpty();
}

//Takenoteof:
//-thebookkeepingrequiredtoimplementastatefuliterator
//-theuseofanotherdatastructure(astack)inthealgorithm
//-howmuchmorecomplicatedthisisthanthesimpletraversals
publicEnext(){
//FindtheleftmostsubtreeNodeofthecurrentnode,pushing
//nodesalongthewaydowntheleftsub-branchtodealwithlater
while(curNode!=null){
fringe.push(curNode);
curNode=curNode.left;
}
//ProcessthedeepestleftsubtreeNode
//Thiswillbethecurrentnodeifthere'snoleftsubtree
curNode=fringe.pop();
//Storeitsitemtoreturn
Eitem=curNode.item;
//MaketherightsubtreeofthedeepestleftsubtreeNode
//thecurrentnodetobeprocessedonthenextcalltonext().
curNode=curNode.right;
returnitem;
}

publicvoidremove(){
thrownewUnsupportedOperationException();
}
}

privateNode<E>root;

publicvoidadd(Eitem){
root=insert(item,root);
}

privateNode<E>insert(Eitem,Node<E>node){
if(node==null){
returnnewNode<E>(item,null,null);
}elseif(item.compareTo(node.item)<0){
node.left=insert(item,node.left);
returnnode;
}else{
node.right=insert(item,node.right);
returnnode;
}
}

publicbooleancontains(Eitem){
returnfind(item,root)!=null;
}

/**
*@todoImplementforreals.Currentlyreturnsnull.
*
*@returnTheNodecontainingtheitem,ornulliftheitemisnotin
*anyofthetree'snodes.
*/
privateNode<E>find(Eitem,Node<E>node){
returnnull;
}

publicIterator<E>iterator(){
returnnewInOrderIterator<E>(root);
}

//Simpletraversals
publicvoidprintPreOrder(){printPreOrder(root);}
publicvoidprintInOrder(){printInOrder(root);}
publicvoidprintPostOrder(){printPostOrder(root);}

privatevoidprintPreOrder(Node<E>node){
if(node!=null){
System.out.print(node.item+"");
printPreOrder(node.left);
printPreOrder(node.right);
}
}

privatevoidprintInOrder(Node<E>node){
if(node!=null){
printInOrder(node.left);
System.out.print(node.item+"");
printInOrder(node.right);
}
}

privatevoidprintPostOrder(Node<E>node){
if(node!=null){
printPostOrder(node.left);
printPostOrder(node.right);
System.out.print(node.item+"");
}
}

//Exercise:howwouldyouprinttheitemsinreverse(descending)order?

publicvoidprintDescending(){
printDescending(root);
}

publicvoidprintDescending(Node<E>node){
if(node!=null){
printDescending(node.right);
System.out.print(node.item+"");
printDescending(node.left);
}
}

publicList<E>toList(){
returninOrderList(root,newArrayList<E>());
}

privateList<E>inOrderList(Node<E>node,List<E>accum){
if(null==node){
returnaccum;
}else{
inOrderList(node.left,accum);
accum.add(node.item);
inOrderList(node.right,accum);
}
returnaccum;
}

publicstaticvoidmain(String[]args){
BinaryTree<Integer>nums=newBinaryTree<>();
nums.add(3);
nums.add(4);
nums.add(1);
nums.add(5);
nums.add(2);

//Printusingsimpletraversals
System.out.print("Pre-order:");
nums.printPreOrder();
System.out.println();
System.out.print("In-order:");
nums.printInOrder();
System.out.println();
System.out.print("Post-order:");
nums.printPostOrder();
System.out.println();
System.out.print("Descending:");
nums.printDescending();
System.out.println();

//Printusingiterator.
for(Integernum:nums){
System.out.println(num+"");
}
//Confirmthatcontainsworks.
for(inti=0;i<7;i++){
System.out.printf("nums.contains(%d)==%b%n",i,nums.contains(i));
}

System.out.println(nums.toList());
}
}
