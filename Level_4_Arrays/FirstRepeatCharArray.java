import java.util.*;

public class FirstRepeatCharArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();

        for(int i : arr) {

            if(!seen.contains(i)) {
                System.out.println("Non-First repeated element: " + i);
                break;
            }

            seen.add(i);
        }
    }
}