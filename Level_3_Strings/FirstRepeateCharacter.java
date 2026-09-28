//FirstRepeateCharacter
import java.util.*;
public class FirstRepeateCharacter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
        HashSet<Character> seen=new HashSet<>();
        HashSet<Character> duplicate=new HashSet<>();
        	for(int i=0;i<str.length();i++){

        		 char ch=str.charAt(i);
        		 if(seen.contains(ch)){
        		 	duplicate.add(ch);
        		 	break;
        		 }else{
        		 	seen.add(ch);
        		 }
        	}	
        	System.out.println("First Repeated Character: "+duplicate);

			
	}
}