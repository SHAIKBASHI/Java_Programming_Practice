//LargestNumber

import java.util.*;
public class LargestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int max=0;
		while(num!=0){
			int d=num%10;
			max=Math.max(max,d);
			num=num/10;
		}
		System.out.println("Max number is "+max);

	}
}