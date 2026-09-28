//LongestWord
import java.util.*;
public class LongestWord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String words="";
		int max=0;
		String[] arr=str.split(" ");
		for(String word:arr){
			max=Math.max(word.length(),max);
			if(word.length()==max){
				words+=word+" ";
			}
		}
		System.out.println(" Longest Word length: "+max);
		System.out.println(" Longest Word: "+words);

	}
}