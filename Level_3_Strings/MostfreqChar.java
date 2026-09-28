//MostfreqChar
import java.util.*;
public class MostfreqChar{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		HashMap<Character,Integer> map=new HashMap<>();
		for( int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);

		}
		int max=0;
		for(int count:map.values()){
			max=Math.max(count,max);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			if(entry.getValue()==max){
				System.out.println(entry.getKey()+ " = "+max);
			}
		}

			

	}
}