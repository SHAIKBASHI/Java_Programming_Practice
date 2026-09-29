//SumOfArray
import java.util.*;
public class SumOfArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				sum+=arr[i];
			}

			System.out.println("Sum of all elements in the array is : "+sum);
	}
}