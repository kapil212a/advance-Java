package HashMaps;
import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap <String , Integer > tm = new TreeMap();
        tm.put("india" , 100);
        tm.put("china" , 150);
        tm.put("us" , 50);
        tm.put("pakistan" , 10);
        System.out.println(tm);
    }
}
