import java.util.*;
public class TwoSumArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");

		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the array elements:");

		for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

		int l=0,r=n-1;

		java.util.Arrays.sort(arr);

		while(l<n){
			int t=9;
			int mid=arr[l]+arr[r];
			if(mid==t){
				System.out.print(l+" "+r);
				break;
			}else if(mid<t){ l++;}
			else {r--;}
		}
		

	}
}