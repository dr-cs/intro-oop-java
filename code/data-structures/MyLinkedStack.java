public class MyLinkedStack<T extends Person> {
private LinkedList<T> list;

public MyLinkedStack() {
list = new LinkedList<T>();
}

public void push(T item) {
list.addFront(item);
}

public T pop() {
return list.removeFront();
}

public static void main(String[] args) {
MyLinkedStack<String> stack = new MyLinkedStack<>();
}
}
