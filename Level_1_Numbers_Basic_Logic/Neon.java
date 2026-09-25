//Neon
import java.util.*;
public class Neon{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int numsq=num*num;
		int og=num,sum=0;
		while(numsq!=0){
			int digit=numsq%10;
			sum+=digit;
			numsq=numsq/10;
		}
		if(og==sum) System.out.println("Neon number");
		else System.out.println("Not a neon number");
	}
}