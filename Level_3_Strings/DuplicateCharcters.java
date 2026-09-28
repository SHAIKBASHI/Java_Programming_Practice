//DuplicateCharcters
import java.util.*;
public class DuplicateCharcters{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String text=sc.nextLine();
	String result="";
	HashSet<Character> set=new HashSet<>();
		for(int i=0;i<text.length();i++){
				char ch=text.charAt(i);
				if(!set.contains(ch)){
					set.add(ch);
						result+=ch;
				}
		}
		System.out.println("Result String: "+result);
		//System.out.println("Result String: "+set);
	}
}