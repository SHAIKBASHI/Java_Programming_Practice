import java.util.*;

public class FirstNonRepeatCharArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find first non-repeated element
        for(int i : arr) {

            if(map.get(i) == 1) {
                System.out.println("First non-repeated element: " + i);
                break;
            }
        }
    }
}