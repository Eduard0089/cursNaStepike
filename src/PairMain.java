import java.util.Objects;

class Pair <T, Y> {
    private T first;
    private Y second;

    public Pair (T first, Y second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }

    public static <T, Y> Pair <T, Y> of (T first, Y second){
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return (Objects.equals(pair.first, first) && Objects.equals(pair.second, second));
    }

    @Override
    public int hashCode() {
        return (Objects.hashCode(first) + Objects.hashCode(second));
    }
}