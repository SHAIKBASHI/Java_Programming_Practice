//PowerOfNum
import java.util.*;
public class PowerOfNum{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the base number: ");
	int base=sc.nextInt();
	System.out.println("Enter the power number: ");
	int pow=sc.nextInt();
	int result=power(base,pow);
	System.out.println("Power of a number is : "+result);

	
}
public static int power(int base,int pow){
	int result=1;
	for(int i=1;i<=pow;i++){
		result=result*base;
	}
	return result;
}
}