import java.util.*;
import java.util.stream.*;

public class DuplicateElementsStream {

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 10, 40, 20, 50};

        Map<Integer, Long> frequency = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        System.out.println("Duplicate elements:");

        frequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}