//LargestArray
import java.util.*;
public class LargestArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int max=0;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				if(arr[i]>max){

					max=arr[i];
				}
			}

			System.out.println("Largest element in the array is : "+max);
	}
}