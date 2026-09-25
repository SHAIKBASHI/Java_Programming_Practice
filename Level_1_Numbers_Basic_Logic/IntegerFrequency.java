//IntegrFrequency
import java.util.*;
public class IntegerFrequency{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	HashMap<Integer,Integer> map=new HashMap<>();
	while(num!=0){
	int digit=num%10;
	map.put(digit,map.getOrDefault(digit,0)+1);
	num=num/10;
	}
	System.out.println(map);
	}
}