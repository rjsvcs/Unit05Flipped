package unit05;

public class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("abc");

        String value = stringContainer.getValue();
        System.out.println(value);

        stringContainer.setValue("def");
        // stringContainer.setValue(123);

        Container<Integer> intContainer = new Container<>(123);
        intContainer.setValue(456);
        // intContainer.setValue("abc");
    }
    
}
