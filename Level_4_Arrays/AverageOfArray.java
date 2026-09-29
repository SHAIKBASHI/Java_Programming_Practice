//AverageOfArray
import java.util.*;
public class AverageOfArray{
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
			double avg=sum/n;

			System.out.println("Average of all elements in the array is : "+avg);
			System.out.println("Sum of all elements in the array is : "+sum);
	}
}