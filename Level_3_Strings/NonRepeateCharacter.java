//NonRepeateCharacter
import java.util.*;
public class NonRepeateCharacter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				 	
				 map.put(ch,map.getOrDefault(ch,0)+1);
				 
			}
				for(int i=0;i<str.length();i++){

					char ch=str.charAt(i);
					if(map.get(ch)==1){
						
						System.out.println("First non-repeated character: "+ch);
						break;
					}

					
				}

			
	}
}