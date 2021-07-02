public class Pair<T, V> {
    T t;
    V v;

    public Pair(T t_, V v_) {
        t = t_;
        v = v_;
    }

    public void display() {
        System.out.println("first: " + t + ", second: " + v + ".");
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }
}
