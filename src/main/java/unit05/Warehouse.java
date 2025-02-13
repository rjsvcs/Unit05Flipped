package unit05;

public class Warehouse<T> {
    private Container<T> container;

    public Warehouse(T value) {
        container = new Container<>(value);
    }

    public Container<T> getContainer() {
        return container;
    }

    public static void main(String[] args) {
        Warehouse<String> wh = new Warehouse<>("abc");
        Container<String> c = wh.getContainer();
        String value = c.getValue();
    }
}
