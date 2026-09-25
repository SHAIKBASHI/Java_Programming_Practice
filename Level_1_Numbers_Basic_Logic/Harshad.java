//Harshad
import java.util.*;
public class Harshad{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0 ,og=num;
		while(num!=0){
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		if(og%sum==0) System.out.println("Harshad number");
		else System.out.println("Not a harshad number");
		
		
	}
}