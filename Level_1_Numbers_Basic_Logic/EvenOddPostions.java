import java.util.*;
public class EvenOddPostions{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int position=1;
		int num=sc.nextInt();
		int sum=0,sub=0;
		while(num!=0){
			int digit=num%10;
			if(position%2==0){
				sum+=digit;
				

			}else{
				
				sub+=digit;
				
			}
			position++;
			num=num/10;
		}
		
	
		System.out.println("Even numbers postion sum "+sum);

		System.out.println("Odd numbers positions sum "+sub);
		

	}
}