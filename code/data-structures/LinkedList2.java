public class LinkedList {

private class Node {
Object data;
Node next;

public Node(Object data, Node next) {
this.data = data;
this.next = next;
}
}

private Node front;

/**
* Add a new item to the front of this list.
*/
public void addFront(Object item) {
front = new Node(item, front);
}

/**
* Return the item at the front of this list and remove it from this list.
*/
public Object removeFront() {
if (null == front) {
throw new RuntimeException("Can't removeFront() on empty list.");
}
Object answer = front.data;
front = front.next;
return answer;
}

/**
* The number of items in this list.
*/
public int length() {
int len = 0;
Node node = front;
while (node != null) {
len++;
node = node.next;
}
return len;
}

/**
* @return true if this list has no elements, false otherwise.
*/
public boolean isEmpty() {
return front == null;
}

public String toString() {
StringBuffer sb = new StringBuffer("[");
for (Node node = front; node != null; node = node.next) {
sb.append(node.data + " ");
}
return sb.toString() + "]";
}

public void insertAfter(Object existingItem, Object newItem) {
Node curNode = front;
while (!curNode.data.equals(existingItem) && 
(curNode.next != null)) {
curNode = curNode.next;
}
Node newNode = new Node(newItem, curNode.next);
curNode.next = newNode;
}

public static void main(String[] args) {
LinkedList lst = new LinkedList();
lst.addFront("Thorny");
lst.addFront("Farva");
lst.addFront("Mac");
lst.addFront("Rabbit");
lst.addFront("Foster");
System.out.println(lst);
System.out.println("How many? " + lst.length());

lst.insertAfter("Rabbit", "Ursula");
System.out.println(lst);
System.out.println("How many? " + lst.length());
lst.insertAfter("Spread it on!", "Chimpo");
System.out.println(lst);
System.out.println("How many? " + lst.length());
}
}
