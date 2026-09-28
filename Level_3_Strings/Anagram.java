//Anagram
import java.util.*;
public class Anagram{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str1=sc.next();
	System.out.println("Enter the string:");
	String str2=sc.next();
	if(str1.length()!=str2.length()){

	 System.out.println("Not the Anagram");
	 return;
	}
	char[] arr=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	java.util.Arrays.sort(arr);
	java.util.Arrays.sort(arr2);
	if(java.util.Arrays.equals(arr,arr2)){
	System.out.println("It is anagram");
}else{
	System.out.println("Not a anagram");
}

	}
}