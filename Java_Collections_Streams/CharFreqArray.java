import java.util.*;
public class CharFreqArray{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String:");

		String n=sc.next();

		HashMap<Character,Integer> map=new HashMap<>();

		for(Character ch:n.toCharArray()){
			//char ch=n.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		System.out.print(" "+map);
		
		
		
		

	}
}

