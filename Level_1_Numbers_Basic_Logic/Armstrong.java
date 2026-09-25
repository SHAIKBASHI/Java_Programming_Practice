//Armstrong
import java.util.*;
public class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int digit=isArmstrong(num);
		if(digit==num) System.out.println("It is armstrong number");
		else System.out.println("Not an armstrong number");
	}
	public static int isArmstrong(int num){
		int  sum=0;
		while(num!=0){
			int d=num%10;
			sum=sum+(d*d*d);
			num=num/10;

		}
		return sum;
	}
}