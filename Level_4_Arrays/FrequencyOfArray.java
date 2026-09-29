//FrequencyOfArray
import java.util.*;
public class FrequencyOfArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for(int i:arr){
				map.put(i,map.getOrDefault(i,0)+1);
			}
			System.out.println(map);
			

 	}
}