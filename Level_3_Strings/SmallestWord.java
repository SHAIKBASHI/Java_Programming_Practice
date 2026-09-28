//SmallestWord
import java.util.*;
public class SmallestWord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String words="";
		int min=Integer.MAX_VALUE;
		String[] arr=str.split(" ");
		for(String word:arr){
			min=Math.min(word.length(),min);
			if(word.length()==min){
				words+=word+" ";
			}
		}
		System.out.println(" Smallest Word length: "+min);
		System.out.println(" Smallest Word: "+words);

	}
}