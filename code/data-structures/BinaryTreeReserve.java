
public List toList() {
return inOrderList(root, new ArrayList<E>());
}

private List<E> inOrderList(Node<E> node, List<E> accum) {
if (node != null) {
inOrderList(node.left, accum);
accum.add(node.item);
inOrderList(node.right, accum);
}
return accum;
}
