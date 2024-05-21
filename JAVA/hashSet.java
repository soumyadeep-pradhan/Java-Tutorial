import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Mercedez");
        myHashSet.add("Audi");
        myHashSet.add("Mercedez");
        myHashSet.add("BMW");
        myHashSet.add("Ford");
        // System.out.println(myHashSet);
        // System.out.println(myHashSet.contains("Audi"));
        // myHashSet.remove("BMW");
        System.out.println(myHashSet.size());
        // myHashSet.clear();
        System.out.println(myHashSet);
        for(String i: myHashSet){
            System.out.println(i);
        }

    }
}
