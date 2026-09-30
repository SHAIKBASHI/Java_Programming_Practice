import java.util.*;
public class MergeArrays{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 1st array size:");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd array size:");
		int m=sc.nextInt();

		int[] arr=new int[n];
		int[] arr2=new int[m];
		int[] merge=new int[n+m];

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<m;i++) arr2[i]=sc.nextInt();

		 for(int i = 0; i < n; i++) {
            merge[i] = arr[i];
        }

        for(int i = 0; i < m; i++) {
            merge[n + i] = arr2[i];
        }

		for(int i=0;i<n+m;i++){
			System.out.println(" "+merge[i]);
		}


	}
}