package unit05;

public class Warehouse<T, U, V> {
    private Container<T> container1;
    private Container<U> container2;
    private Container<V> container3;

    public Warehouse(T value1, U value2, V value3) {
        container1 = new Container<>(value1);
        container2 = new Container<>(value2);
        container3 = new Container<>(value3);
    }

    public Container<T> getContainer1() {
        return container1;
    }

    public Container<U> getContainer2() {
        return container2;
    }

    public Container<V> getContainer3() {
        return container3;
    }

    public static void main(String[] args) {
        Warehouse<String, Integer, String> warehouse1 = 
            new Warehouse<>("abc", 123, "def");
        Container<String> container1 = warehouse1.getContainer1();
        System.out.println(container1.getValue());
        Container<Integer> container2 = warehouse1.getContainer2();
        System.out.println(container2.getValue());
        Container<String> container3 = warehouse1.getContainer3();
        System.out.println(container3.getValue());

        // Warehouse<Integer> warehouse2 = new Warehouse<>(122);
        // Container<Integer> container2 = warehouse2.getContainer1();
        // System.out.println(container2.getValue());
    }
}
