//CoPrimes
import java.util.*;
public class CoPrimes{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number: ");
	int fst=sc.nextInt();
	System.out.println("Enter the 2nd number: ");
	int sec=sc.nextInt();
	int coprimes=gcd(fst,sec);
	if(coprimes==1){
	System.out.println("These are Coprimes");
	}else{
	System.out.println("These are Not Coprimes");
	}
	}
	public static int gcd(int fst,int sec){
	int gcd=1;
	for(int i=1;i<Math.min(fst,sec);i++){
	if(fst%i==0&& sec%i==0){
	gcd=i;
	}

	}
	return gcd;
	}
}