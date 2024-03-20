package lesson6;


public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println("Pair: " + pair);

        pair.setFirst(20);
        pair.setSecond("World");
        System.out.println("Updated pair: " + pair);

        Pair<Integer, String> anotherPair = new Pair<>(10, "Hello");
        System.out.println("Are the pairs equal? " + pair.equals(anotherPair));
    }
}


