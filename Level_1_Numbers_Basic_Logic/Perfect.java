//PerfectNumber
import java.util.*;

public class Perfect{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(sum==num) System.out.println("perfect number");
		else System.out.println("not a perfect number");
	}
}