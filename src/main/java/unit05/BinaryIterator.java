package unit05;

import java.util.Iterator;

public class BinaryIterator implements Iterator<String> {
    private final int max;
    private int current;

    public BinaryIterator(int max) {
        this.max = max;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        System.out.println("hasNext: " + (current <= max));
        return current <= max;
    }

    @Override
    public String next() {
        String binary = Integer.toBinaryString(current);
        System.out.println("next: " + binary);
        current++;
        return binary;
    }
}
