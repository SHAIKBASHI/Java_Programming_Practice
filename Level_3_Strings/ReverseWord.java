//ReverseWord

import java.util.*;
public class ReverseWord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String result="";
		String[] words=str.split(" ");
		for(String word:words ){

		for(int i=word.length()-1;i>=0;i--){
		char ch=word.charAt(i);
		result+=ch;

		}
		 result += " ";

		}
        System.out.println("Reverse of each word is : "+result);

			
	}
}