import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("England", "London");
        myHashMap.put("Germany", "Berlin");
        myHashMap.put("USA", "Washington DC");
        // myHashMap.remove("Germany");
        System.out.println(myHashMap.get("England"));
        // myHashMap.clear();
        
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());

    }
}
