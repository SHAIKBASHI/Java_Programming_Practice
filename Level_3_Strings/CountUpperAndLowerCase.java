//CountUpperAndLowerCase
import java.util.*;
public class CountUpperAndLowerCase{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.next();
	int uppercase=0,lowercase=0,digits=0,special=0,letters=0;
	for(int i=0;i<str.length();i++){
	char ch=str.charAt(i);
	if(Character.isUpperCase(ch)){
	uppercase++;
	letters++;
	}else if(Character.isLowerCase(ch)){
	lowercase++;
	letters++;
	}else if(Character.isDigit(ch)){
		digits++;
	}else{
		special++;
	}
	}
	System.out.println("Uppercase : "+uppercase);
	System.out.println("Lowercase : "+lowercase);
	System.out.println("Digits : "+digits);
	System.out.println("Letters : "+letters);
	System.out.println("Special Characters: "+special);
	}
}