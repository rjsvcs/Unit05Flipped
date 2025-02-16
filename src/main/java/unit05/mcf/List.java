package unit05.mcf;

public interface List<E> {
    void append(E value);
    E get(int index);
    void set(int index, E value);
    int size();

    void insert(int index, E value);
    E remove(int index);
}
