import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", 10);
        Cat anotherCat = new Cat("Мурка", 10);
        HashSet<Cat> catSet = new HashSet<>();
        catSet.add(cat);
        catSet.add(anotherCat);
        System.out.println(catSet);
    }
}
