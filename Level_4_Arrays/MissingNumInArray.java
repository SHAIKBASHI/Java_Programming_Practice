//MissingNumInArray
import java.util.*;
public class MissingNumInArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int N=n+1;
		
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int expectedSum=0;
			int acutualSum=N*(N+1)/2;

			for(int i:arr){
				expectedSum+=i;
			}

			int result=acutualSum-expectedSum;
			System.out.println("Missing number: "+result);
			

 	}
}