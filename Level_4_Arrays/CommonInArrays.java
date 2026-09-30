import java.util.*;
public class CommonInArrays{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 1st array size:");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd array size:");
		int m=sc.nextInt();

		int[] arr=new int[n];
		int[] arr2=new int[m];

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<m;i++) arr2[i]=sc.nextInt();

		for(int i=0;i<n;i++){

			for(int j=0;j<m;j++){

				if(arr[i]==arr2[j]){

				System.out.println(" Common elements: "+arr[i]);
				break;

				}

			}
		}


	}
}