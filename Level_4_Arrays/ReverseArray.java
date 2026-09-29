//ReverseArray
import java.util.*;
public class ReverseArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}

			 int start = 0;
        int end = n - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }	

			for(int i=0;i<n;i++){

				System.out.println(" "+arr[i]);

			}
			


 	}
}