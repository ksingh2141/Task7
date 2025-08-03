package Task_7;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList before clearing: " + list);

        list.clear();  // Removes all elements

        System.out.println("ArrayList after clearing: " + list);
    }
}
