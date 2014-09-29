
publicListtoList(){
returninOrderList(root,newArrayList<E>());
}

privateList<E>inOrderList(Node<E>node,List<E>accum){
if(node!=null){
inOrderList(node.left,accum);
accum.add(node.item);
inOrderList(node.right,accum);
}
returnaccum;
}
