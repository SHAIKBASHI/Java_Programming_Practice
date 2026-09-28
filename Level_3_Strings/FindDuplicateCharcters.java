//FindDuplicateCharcters
import java.util.*;
public class FindDuplicateCharcters{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String text=sc.nextLine();
	HashSet<Character> seen=new HashSet<>();
	HashSet<Character> duplicate=new HashSet<>();

		for(int i=0;i<text.length();i++){
				char ch=text.charAt(i);
				if(!seen.contains(ch)){
					seen.add(ch);
				}else{
					 duplicate.add(ch);
				}
		}
		System.out.println("duplicate String: "+duplicate);
		System.out.println("Not duplicates String: "+seen);
		
	}
}