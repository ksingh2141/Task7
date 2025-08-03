package Task_7;
import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(103, "Alice");
        employees.put(101, "Charlie");
        employees.put(102, "Bob");

        System.out.println("Employee names in alphabetical order:");
        employees.values().stream().sorted().forEach(System.out::println);
    }
}
