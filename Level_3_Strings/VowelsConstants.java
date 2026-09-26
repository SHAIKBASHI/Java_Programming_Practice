//VowelsAndConstants
import java.util.*;
public class VowelsConstants{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String name=sc.next();
	name=name.toLowerCase();
	int vowels=0,constants=0;
	for(int i=0;i<name.length();i++){
	char ch=name.charAt(i);
	if(ch=='a'||ch=='u'||ch=='o'||ch=='i'||ch=='e') vowels++;
	else constants++;
	}
	System.out.println(" Vowels = "+vowels);
	System.out.println(" Constants = "+constants);

	}
}