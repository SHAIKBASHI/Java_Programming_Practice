import java.util.*;
import java.util.stream.*;

public class CharacterFrequencyStream {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.next();

        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        System.out.println(map);
    }
}