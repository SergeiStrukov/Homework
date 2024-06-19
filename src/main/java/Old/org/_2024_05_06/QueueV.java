package Old.org._2024_05_06;

public interface QueueV<T> {
    void add(T t);
    T remove();
    boolean isEmpty();
}
