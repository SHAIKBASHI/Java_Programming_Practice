import java.util.*;

public class SortByFirstCharacter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a, b) ->
            Character.compare(a.charAt(3), b.charAt(3))
        );

        System.out.println("Sorted Strings:");

        for(String str : arr) {
            System.out.println(str);
        }
    }
}