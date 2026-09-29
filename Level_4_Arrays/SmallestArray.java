//SmallestArray
import java.util.*;
public class SmallestArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int min=Integer.MAX_VALUE;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				if(arr[i]<min){

					min=arr[i];
				}
			}

			System.out.println("Smallest element in the array is : "+min);
	}
}