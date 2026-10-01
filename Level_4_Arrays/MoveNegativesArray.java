import java.util.*;
public class MoveNegativesArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");

		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the array elements:");

		for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

		int r=0;

		for(int i=0;i<n;i++){

			if(arr[i]<0){
				int temp=arr[r];
				arr[r]=arr[i];
				arr[i]=temp;
				r++;
			}
		}


		for(int i:arr) System.out.print(" "+i);
		

	}
}