import java.util.*;
public class SecondLargest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Original number is :"+num);
		int max=-1,secmax=-1;
		while(num!=0){
			int digit=num%10;
			if(digit>max) {
				secmax=max;
				max=digit;
			}else if (digit>secmax&&secmax<max){
				secmax=digit;
			}
			num=num/10;
		}
		System.out.println("maximum number is :"+max);
		System.out.println("Second maximum number is :"+secmax);
	}
}