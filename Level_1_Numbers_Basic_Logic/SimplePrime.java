import java.util.*;
public class SimplePrime{
	public static boolean isPrime(int num){
			
		 if(num<2) return false;

		if(num==2) return true;

		if( num%2==0) return false;
		
		for(int i=3;i*i<=num;i+=2) {
			if(num%i==0) return false;
	}
	return true;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
	if(isPrime(num)) System.out.println("It is a prime number");
	else System.out.println("Not a prime number");
	}
}