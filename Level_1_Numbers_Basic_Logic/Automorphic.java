//Automorphic
import java.util.*;
public class Automorphic{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int numsq=num*num;
		int count=count(num);
		
		int divisor=1;

		for(int i=1;i<=count;i++){
			divisor=divisor*10;
		}

		int lastdig=numsq%divisor;

		if(num==lastdig) System.out.println("This Number is Automorphic ");
		else System.out.println("Not Automorphic");
	}
	public static int count(int num){
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		return count;
	}
}