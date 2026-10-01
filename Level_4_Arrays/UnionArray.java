import java.util.*;
public class UnionArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");

		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter the array elements: ");
		
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();

		System.out.println("Enter the array size:");

		int m=sc.nextInt();

		int arr1[]=new int[m];

		System.out.println("Enter the array elements: ");
		
		for(int j=0;j<m;j++) arr1[j]=sc.nextInt();

		LinkedHashSet<Integer> set=new LinkedHashSet<>();

		for(int p:arr) set.add(p);

		for(int q:arr1) set.add(q);

		System.out.print(" "+set);

	}
}