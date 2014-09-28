public class PartialIntArray {

private int[] elementData;
private int size;

public PartialIntArray(int initialCapacity) {
if (initialCapacity < 0)
throw new IllegalArgumentException("Illegal Capacity: "+
initialCapacity);
this.elementData = new int[initialCapacity];
}

public ArrayList() {
this(10);
}

// ...
}
