package unit05;

public class Locker<T> extends Container<T> {

    private boolean locked;

    public Locker(T value) {
        super(value);
        this.locked = false;
    }

    public void toggleLock() {
        locked = !locked;
    }

    @Override
    public T getValue() {
        return locked ? null : super.getValue();
    }
}
