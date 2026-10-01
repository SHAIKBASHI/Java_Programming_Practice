import java.util.*;
public class KadanesArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");

		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)  arr[i]=sc.nextInt();
		
		int cursum=arr[0];
		int maxsum=arr[0];

		for(int i=1;i<n;i++){
			cursum=Math.max(arr[i],cursum+arr[i]);
			maxsum=Math.max(maxsum,cursum);
		}
		

		 System.out.println("Maximum Subarray Sum: " + maxsum);

		
		

	}
}

