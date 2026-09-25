//Frequency Program

import java.util.*;
import java.util.HashMap;
public class Frequency{
	public static void main (String args[]){
	String name="Programming";
	HashMap<Character,Integer> map=new HashMap<>();
	for(char ch:name.toCharArray()){
	map.put(ch,map.getOrDefault(ch,0)+1);
	}
    System.out.println(map);
	}
}
