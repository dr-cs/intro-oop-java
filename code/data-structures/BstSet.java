publicclassBstSet<EextendsComparable<E>>extendsBinarySearchTree<E>{

protectedNode<E>insert(EnewItem,Node<E>node){
if(node==null){
returnnewNode<E>(newItem,null,null);
}elseif(newItem.compareTo(node.item)<0){
node.left=insert(newItem,node.left);
returnnode;
}elseif(newItem.equals(node.item)){
returnnode;
}else{
node.right=insert(newItem,node.right);
returnnode;
}
}

publicstaticvoidmain(String[]args){
BinarySearchTree<Integer>nums=newBstSet<>();
nums.add(3);
nums.add(4);
nums.add(1);
nums.add(5);
nums.add(2);
nums.add(4);
nums.add(1);
System.out.println(nums);
}
}
