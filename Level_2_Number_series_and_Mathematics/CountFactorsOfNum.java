//CountFactorsOfNum

import java.util.*;
public class CountFactorsOfNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number N: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++){
		if(num%i==0){
			count++;
		
		
		}
		}
		System.out.print("Number of Factors: "+count);
	}
}