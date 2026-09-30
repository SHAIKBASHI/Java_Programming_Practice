import java.util.*;

public class IntersectionArrays {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st array size:");
        int n = sc.nextInt();

        System.out.println("Enter the 2nd array size:");
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter the 1st array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd array elements:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Store first array elements
        for(int i : arr) {
            set1.add(i);
        }

        // Find common elements
        for(int i : arr2) {
            if(set1.contains(i)) {
                intersection.add(i);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}