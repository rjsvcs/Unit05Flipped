package unit05;

import java.util.Iterator;

public class BinaryCounter implements Iterable<String> {
    private final int max;

    public BinaryCounter(int max) {
        this.max = max;
    }

    @Override
    public Iterator<String> iterator() {
        System.out.println("iterator called");
        return new BinaryIterator(max);
    }

    public static void main(String[] args) {
        BinaryCounter counter = new BinaryCounter(15);

        for (String binary : counter) {
            System.out.println(binary);
        }
    }
}
