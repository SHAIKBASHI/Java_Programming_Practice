//Nums1toN
import java.util.*;
public class Nums1toN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number N: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(" "+i);
		}
	}
}