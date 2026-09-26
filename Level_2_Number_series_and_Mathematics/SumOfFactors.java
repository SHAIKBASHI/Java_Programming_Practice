//SumOfFactors

import java.util.*;
public class SumOfFactors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number N: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
		if(num%i==0){
		sum+=i;
		
		}
		}
		System.out.println("Sum of Factors : "+sum);
	}
}