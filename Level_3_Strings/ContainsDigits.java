//ContainsDigits
import java.util.*;
public class ContainsDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean isDigit=true;

		for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);

		if(!Character.isDigit(ch)){
		isDigit=false;
		break;
		}


		}
		if(isDigit) {
    System.out.println("Contains only digits");
} else {
    System.out.println("Does not contain only digits");
}
	}
}