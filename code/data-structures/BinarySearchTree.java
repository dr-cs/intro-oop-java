importjava.util.ArrayList;
importjava.util.Arrays;
importjava.util.Iterator;
importjava.util.List;
importjava.util.NoSuchElementException;

publicclassBinarySearchTree<EextendsComparable<?superE>>
implementsIterable<E>{

protectedclassNode<E>{
Eitem;
Node<E>left;
Node<E>right;

Node(Eitem,Node<E>left,Node<E>right){
this.item=item;
this.left=left;
this.right=right;
}
}

protectedclassInOrderIterator<E>implementsIterator<E>{

Node<E>curNode;
//fringeistheto-dolistofunprocessednodes.
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

protectedNode<E>root;

publicvoidadd(Eitem){
root=insert(item,root);
}

protectedNode<E>insert(EnewItem,Node<E>node){
if(node==null){
returnnewNode<E>(newItem,null,null);
}elseif(newItem.compareTo(node.item)<0){
node.left=insert(newItem,node.left);
returnnode;
}else{
node.right=insert(newItem,node.right);
returnnode;
}
}

publicbooleancontains(Eitem){
returnfindNode(item,root)!=null;
}

/**
*@returnTheNodecontainingtheitem,ornulliftheitemisnotin
*anyofthetree'snodes.
*/
privateNode<E>findNode(EqueryItem,Node<E>node){
if(null==node){
returnnull;
}elseif(node.item.equals(queryItem)){
returnnode;
}elseif(queryItem.compareTo(node.item)<0){
returnfindNode(queryItem,node.left);
}else{
returnfindNode(queryItem,node.right);
}
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

publicList<E>inOrderImperative(){
Node<E>curNode=root;
//fringeistheto-dolistofunprocessednodes.
Stack<Node<E>>fringe=newLinkedStack<>();
List<E>accum=newArrayList<E>();
while((curNode!=null)||!fringe.isEmpty()){
//FindtheleftmostsubtreeNodeofthecurrentnode,pushing
//nodesalongthewaydowntheleftsub-branchtodealwithlater
while(curNode!=null){
fringe.push(curNode);
curNode=curNode.left;
}
//ProcessthedeepestleftsubtreeNode
//Thiswillbethecurrentnodeifthere'snoleftsubtree
curNode=fringe.pop();
//Addcurrentitemtoaccumulatinglist
accum.add(curNode.item);
//MaketherightsubtreeofthedeepestleftsubtreeNode
//thecurrentnodetobeprocessednext
curNode=curNode.right;
}
returnaccum;
}

@Override
publicStringtoString(){
Stringelements=toStringHelper(root,newStringBuilder()).toString();
return"["+elements.substring(0,elements.length()-2)+"]";
}

privateStringBuildertoStringHelper(Node<E>node,StringBuilderaccum){
if(null==node){
returnaccum;
}else{
toStringHelper(node.left,accum);
accum.append(node.item+",");
toStringHelper(node.right,accum);
}
returnaccum;
}

publicList<E>path(EqueryItem){
Node<E>curNode=root;
List<E>pathList=newArrayList<>();
booleanfound=false;
while(curNode!=null&&!found){
if(queryItem.equals(curNode.item)){
pathList.add(queryItem);
found=true;
}elseif(queryItem.compareTo(curNode.item)<0){
pathList.add(curNode.item);
curNode=curNode.left;
}else{
pathList.add(curNode.item);
curNode=curNode.right;
}
}
returnfound?pathList:newArrayList<E>();
}

publicstaticvoidmain(String[]args){
BinarySearchTree<Integer>nums=newBinarySearchTree<>();
List<Integer>toBeAdded=Arrays.asList(3,4,1,5,2);
System.out.println("Elementstobeadded:"+toBeAdded);
for(Integerelement:toBeAdded)nums.add(element);
System.out.println("StartingBST:"+nums.toString());
System.out.println("Pathto1:"+nums.path(1));
System.out.println("Pathto2:"+nums.path(2));
System.out.println("Pathto3:"+nums.path(3));
System.out.println("Pathto4:"+nums.path(4));
System.out.println("Pathto5:"+nums.path(5));
System.out.println("Pathto6:"+nums.path(6));
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
System.out.print(num+"");
}
System.out.println();
//Confirmthatcontainsworks.
for(inti=0;i<7;i++){
System.out.printf("nums.contains(%d)==%b%n",i,nums.contains(i));
}

System.out.println("nums.toList()(recursive):"+nums.toList());
System.out.println("inOrderImperative():"+nums.inOrderImperative());
}
}
