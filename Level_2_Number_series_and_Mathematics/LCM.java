//LCM
import java.util.*;
public class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the 1st Number ");
		int fst=sc.nextInt();
		System.out.println(" Enter the 2nd Number ");
		int sec=sc.nextInt();
		int lcm=multiples(fst,sec);
		System.out.print("LCM is: "+lcm);

	}
	public static int multiples(int fst,int sec){
		int lcm=Math.max(fst,sec);
		while(true){
			if(lcm%fst==0&& lcm%sec==0){
				return lcm;

			}
			lcm++;
		}
		
	}
}