import java.util.*;
public class Strong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int factsum=0;
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int og=num;
		while(num!=0){
			int digit=num%10;
			factsum+=Factorial(digit);
			num=num/10;

		}
		if(factsum==og){
			System.out.println("Strong number");
		}else{
			System.out.println("Not Strong number");
		}
		
	}
	public static int Factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}
}
