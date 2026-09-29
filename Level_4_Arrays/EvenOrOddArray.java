//EvenOrOddArray
import java.util.*;
public class EvenOrOddArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int even=0,odd=0;
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	

			for(int i=0;i<n;i++){
				if(arr[i]%2==0) even++;
				else odd++;
			}
			

			System.out.println("Even elements in the array is : "+even);
			System.out.println("Odd elements in the array is : "+odd);
 	}
}