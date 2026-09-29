//PositiveOrNegativeArray
import java.util.*;
public class PositiveOrNegativeArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int positive=0,negative=0,zero=0;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				if(arr[i]>0) positive++;
				else if(arr[i]==0) zero++;
				else negative++;
			}
			

			System.out.println("positive elements in the array is : "+positive);
			System.out.println("negative elements in the array is : "+negative);
			System.out.println("zero elemnts in the array is : "+zero);
 	}
}