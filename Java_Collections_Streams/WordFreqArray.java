import java.util.*;
public class WordFreqArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String:");

		String word=sc.nextLine();

		String arr[]=word.split(" ");

		HashMap<String,Integer> map=new HashMap<>();

		for(String w:arr){
			
			map.put(w,map.getOrDefault(w,0)+1);
		}
		System.out.print(" "+map);
		
		
		
		

	}
}

