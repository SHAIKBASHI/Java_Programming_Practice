//Wordfreq
import java.util.*;
public class Wordfreq{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String[] word=str.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
			for(String words:word){
				
				 	
				 map.put(words,map.getOrDefault(words,0)+1);
				 
			}
				System.out.println(map);

			
	}
}