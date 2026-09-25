// Reverse

import java.util.*;
public class Reverse{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int rev=isReverse(num);
		System.out.println("Original Number is: "+num);
		System.out.println("Revrse Number is: "+rev);
	}
	public static int isReverse(int num){
		int rev=0;
		while(num!=0){
			int digit =num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
}