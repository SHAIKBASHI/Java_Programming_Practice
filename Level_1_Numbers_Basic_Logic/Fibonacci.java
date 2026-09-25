//Fibonacci
import java.util.*;
public class Fibonacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int f1=0,f2=1;
		while(num>=0){
			System.out.print(" "+f1);
			int f3=f2+f1;
			
			f2=f1;
			f1=f3;
			num--;
		}
	}
}