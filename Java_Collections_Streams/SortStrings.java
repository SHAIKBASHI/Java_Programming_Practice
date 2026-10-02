import java.util.*;

public class SortStrings {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, Comparator.naturalOrder());

        System.out.println("Sorted Strings:");

        for(String str : arr) {
            System.out.println(str);
        }
    }
}