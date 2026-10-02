import java.util.*;

public class SortHashMapByKeys {

    public static void main(String args[]) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(30, "Apple");
        map.put(10, "Banana");
        map.put(20, "Mango");
        map.put(40, "Orange");

        System.out.println("Original HashMap:");
        System.out.println(map);

        TreeMap<Integer, String> sorted = new TreeMap<>(map);

        System.out.println("Sorted by Keys:");
        System.out.println(sorted);
    }
}