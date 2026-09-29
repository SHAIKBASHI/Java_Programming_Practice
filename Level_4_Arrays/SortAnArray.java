//SortAnArray
import java.util.*;
public class SortAnArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			//Arrays.sort(arr);

			 for(int i=0;i<n;i++){
			 	for(int j=i;j<n;j++){
			 		if(arr[i]>arr[j]){
			 			int temp=arr[i];
			 		
			 		arr[i]=arr[j];
			 		arr[j]=temp;
			 	}
			 	}
			 }
			for(int i=0;i<n;i++){
				System.out.print(" "+arr[i]);
			}


 	}
}