//RemoveDuplicatesInArray
import java.util.*;
public class RemoveDuplicatesInArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			for(int i:arr){
				set.add(i);
			}
			
			
				System.out.print(" "+set);
			
			

 	}
}