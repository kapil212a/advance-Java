package HashMaps;
import java.util.*;

public class lteration {
    public static void main(String[] args) {
        HashMap <String , Integer> hm = new HashMap<>();

        hm.put("india" , 100);
        hm.put("us" , 50);
        hm.put("china" , 150);
        hm.put("india" , 80);

        Set <String> st =  hm.keySet();
        System.out.println(st);

        for(String s : st){
            System.out.println("key = "+s +" , value = " + hm.get(s) );
        }
    }
}
