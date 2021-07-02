public class Solo<T> {
    private T t;

    public Solo(T t_) {
        t = t_;
    }

    public T getValue() {
        return t;
    }

    public void setValue(T t_) {
        t = t_;
    }
}