package HashMaps;
import java.util.*;;

public class Hashing {
    public static void main (String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        // put operation --- o(1)

        hm.put("India" , 150);
        hm.put("Nepal" , 50);
        hm.put("China" , 160);

        System.out.println(hm);

        //get operation  -- o(1)
        int population = hm.get("India");
        System.out.println(population);

        //conatainsKey operation --- o(1)

        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Indonesia"));


        //remove operation  -- o(1)

        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonesia"));

        System.out.println(hm);

        //size of HashMap
        System.out.println(hm.size());

        //isEmpty operatin  
        System.out.println(hm.isEmpty());

        //clear opertaion 
        hm.clear();
        System.out.println(hm);
    }
    
    
}
