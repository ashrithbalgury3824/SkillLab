package lab7a;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
}
