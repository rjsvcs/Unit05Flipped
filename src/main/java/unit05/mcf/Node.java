package unit05.mcf;

public class Node {
    private String value;
    private Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(String value) {
        this(value, null);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " -> " + next;
    }

    public static void main(String[] args) {
        Node one = new Node("abc");
        Node two = new Node("def");
        Node three = new Node("ghi");

        one.setNext(two);
        two.setNext(three);

        System.out.println(one);
    }
    
}
