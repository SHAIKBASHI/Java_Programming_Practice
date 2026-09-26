//PalindromeString
import java.util.*;
public class PalindromeString{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String name=sc.next();
	String rev="";
	for(int i=name.length()-1;i>=0;i--){
	rev+=name.charAt(i);
	}
	if(name.equals(rev)){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not a Palindrome");
	}
	}
}