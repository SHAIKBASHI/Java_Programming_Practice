//CountEvenOrOdd


import java.util.*;
public class CountEvenOrOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ecount=0,ocount=0;
		while(num!=0){
			int digit=num%10;
			if(digit%2==0){
				even.add(digit);
				ecount++;
			}else{
				odd.add(digit);
				ocount++;
			}
			
			num=num/10;
		}
		
	Collections.reverse(even);
Collections.reverse(odd);
		System.out.println("Even numbers "+even+" ="+ecount);
		System.out.println("Odd numbers "+odd+" ="+ocount);
		

	}
}