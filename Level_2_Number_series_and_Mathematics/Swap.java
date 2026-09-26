//Swap

import java.util.*;
public class Swap{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number: ");
	int fst=sc.nextInt();
	System.out.println("Enter the 2nd number: ");
	int sec=sc.nextInt();
	System.out.println("1st  number is : "+fst);
	System.out.println("2nd  number is : "+sec);
	fst=fst+sec;
	sec=fst-sec;
	fst=fst-sec;
	 System.out.println("After swapping:");
	System.out.println("1st  number is : "+fst);
	System.out.println("2nd  number is : "+sec);
	
}

}