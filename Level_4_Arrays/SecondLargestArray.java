//SecondLargestArray
import java.util.*;
public class SecondLargestArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int sec=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				if(arr[i]>max){

					sec=max;
					max=arr[i];
				}else if(arr[i]>sec&&arr[i]<max){
					sec=arr[i];
				}
			}

			System.out.println("Second largest element in the array is : "+sec);
	}
}