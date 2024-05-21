import java.util.HashSet;
public class integersInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(4);
        myHashSet.add(7);
        myHashSet.add(5);
        myHashSet.add(2);
        myHashSet.add(9);
        myHashSet.add(6);
        for(int i = 0; i<=10; i++){
            if(myHashSet.contains(i)){
                System.out.println(i+"is contained in the HashSet");
            }
            else{
                System.out.println(i+"is not contained in the HashSet");
            }
        }

    }
}
