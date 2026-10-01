import java.util.*;
public class ThreeSumArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");

		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)  arr[i]=sc.nextInt();
		System.out.println("Enter the target:");
        int t = sc.nextInt();
		

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					if(arr[i]+arr[j]+arr[k]==t){
						System.out.println(
                            arr[i] + " + " + arr[j] + " + "
                            + arr[k] + " = " + t
                        );

                        return;
					}
				}
			}
		}

		
		

	}
}

