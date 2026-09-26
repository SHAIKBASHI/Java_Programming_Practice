//GCDOrHCF
import java.util.*;
public class GCDOrHCF{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the 1st Number ");
		int fst=sc.nextInt();
		System.out.println(" Enter the 2nd Number ");
		int sec=sc.nextInt();
		int gcd=factors(fst,sec);
		System.out.print("Gcd is: "+gcd);

	}
	public static int factors(int fst,int sec){
		int gcd=1;
		for(int i=1;i<=Math.min(fst,sec);i++){
			if(fst%i==0&& sec%i==0){
				gcd=i;

			}
		}
		return gcd;
	}
}