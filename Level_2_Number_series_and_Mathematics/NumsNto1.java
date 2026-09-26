//NumsNto1
import java.util.*;
public class NumsNto1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number N: ");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--){
			System.out.print(" "+i);
		}
	}
}