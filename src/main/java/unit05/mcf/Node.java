package unit05.mcf;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(T value) {
        this(value, null);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
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
        Node<String> one = new Node<>("abc");
        Node<String> two = new Node<>("def");
        Node<String> three = new Node<>("ghi");

        one.setNext(two);
        two.setNext(three);

        System.out.println(one);
    }
    
}
