public class Duet {
    public static <T extends Comparable<T>> T min(T x, T y){
        T min = x;

        if(y.compareTo(min) < 0){
            min = y;
        }

        return min;
    }

    public static <T extends Comparable<T>> T max(T x, T y) {
        T max = x;

        if(y.compareTo(max) > 0){
            max = y;
        }

        return max;
    }
}
