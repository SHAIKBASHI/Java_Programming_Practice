//Plaindrome
import java.util.*;
public class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digits of number: ");

		int num=sc.nextInt();
		int og=num;
		int sum=isPalindrome(num);
		if(sum==og){
			System.out.println("It is a Plaindrome");
		}else{
			System.out.println("Not a palindrome");
		}

	}
	public static int isPalindrome(int num){
		int sum=0;

		while(num!=0){
			int digit =num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		return sum;
	}
}