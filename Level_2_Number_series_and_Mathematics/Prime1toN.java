//Prime1toN
import java.util.*;
public class Prime1toN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number N: ");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++){
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++){
				
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
			System.out.print(" "+i);
		}
		}
	}
}