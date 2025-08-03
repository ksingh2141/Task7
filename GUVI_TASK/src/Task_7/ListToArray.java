package Task_7;
import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        String[] array = list.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
