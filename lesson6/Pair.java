package lesson6;

import java.util.Objects;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        if (first == null) {
            throw new IllegalArgumentException("First element cannot be null");
        }
        this.first = first;
    }

    public void setSecond(U second) {
    if (second == null) {
        throw new IllegalArgumentException("Second element cannot be null");
    }
    this.second = second;
}

    @Override
    public String toString() {
    return "(" + first + ", " + second + ")";
    }


    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pair<?, ?> pair = (Pair<?, ?>) obj;
    return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
    return Objects.hash(first, second);
    }   
}  