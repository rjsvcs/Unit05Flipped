package unit05.mcf;

public interface Queue {
    void enqueue(String element);
    String dequeue();
    int size();
    String front();
    String back();
    boolean isEmpty();    
}
