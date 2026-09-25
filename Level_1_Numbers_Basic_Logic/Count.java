//Count
import java.util.*;
public class Count{
	public static void main(String args[]){
	long count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long num=sc.nextLong();
		while(num!=0){
			count++;
			num=num/10;

		}
		System.out.println("Numbers count is: "+count);
	}
}
