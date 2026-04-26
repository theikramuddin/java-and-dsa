import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Classroom {

public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -> O(1)
        hm.put("india", 120);
        hm.put("japan", 100);
        hm.put("korea", 80);
        hm.put("germany", 60);

        //Get -> O(1)
        int value = hm.get("india");

        //ContainsKey -> O(1)
        boolean isPresent = hm.containsKey("japan");

        //Remove -> O(1)
        int value2 = hm.remove("japan");

        //Size -> O(1)
        int size = hm.size();

        //isEmpty -> O(1)
        // hm.clear();
        boolean isEmpty = hm.isEmpty();

        //Iterate -> O(1)
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("Keys = "+ k + " Values = "+hm.get(k));
        }
        // System.out.println(isEmpty);
}

}