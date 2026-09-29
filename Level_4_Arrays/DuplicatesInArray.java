//DuplicatesInArray
import java.util.*;
public class DuplicatesInArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int dupli=0;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			

			 for(int i=0;i<n;i++){
			 	for(int j=i+1;j<n;j++){
			 		if(arr[i]==arr[j]){
			 			System.out.print(" "+arr[i]);
			 			break;
			 	}
			 	}
			 }
			

 	}
}