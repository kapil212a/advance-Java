package HashMaps;
import java.util.*;
public class linkedHash {
    public static void main(String[] args) {
        LinkedHashMap <String , Integer> lh = new LinkedHashMap<>();
        lh.put("india" , 100);
        lh.put("china" , 150);
        lh.put("us" , 50);
        lh.put("pakistan" , 10);
        System.out.println(lh);
    }
}
