package unit05.mcf;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        System.out.println("constructor: " + value.getClass());
        this.value = value;
        this.next = next;
    }

    public Node(T value) {
        this(value, null);
    }

    public T getValue() {
        System.out.println("getting: " + value.getClass());
        return value;
    }

    public void setValue(T value) {
        System.out.println("setting: " + value.getClass());
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " -> " + next;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(123);
        int x = node.getValue();
        System.out.println(x);
        node.setValue(456);
    }
}
