//LargestNum

import java.util.*;
public class LargestNum{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number: ");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd number: ");
	int b=sc.nextInt();
	System.out.println("Enter the 3rd number: ");
	int c=sc.nextInt();
	System.out.println();
	System.out.println();
	if(a>b&&a>c){
		System.out.println(" 1st Number is largest");
	}else if(b>c){
		System.out.println("2nd Number is largest");
	}else{
		System.out.println("3rd Number is largest");
	}
	
		
}

}