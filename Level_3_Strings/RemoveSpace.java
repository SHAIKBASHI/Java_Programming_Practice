//RemoveSpace
import java.util.*;
public class RemoveSpace{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String text=sc.nextLine();
	String result="";
	for(int i=0;i<text.length();i++){
		char ch=text.charAt(i);

			if(ch!=' '){
				result+=ch;
			}
	}
		System.out.println("STring without space: "+result);
	}
}