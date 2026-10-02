import java.util.*;

public class DuplicateValues {

    public static void main(String args[]) {

    int[] arr={10,20,30,10,40,10,20,30,50,60,70};
    HashSet<Integer> see=new HashSet<>();
    HashSet<Integer> duplicate=new HashSet<>();

    for(int i:arr){
        if(see.contains(i)){
            duplicate.add(i);
        }
        see.add(i);
    }        
System.out.print(" "+duplicate);
System.out.print(" "+see);
    }
}