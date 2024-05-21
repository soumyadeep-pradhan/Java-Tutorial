import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> mArrayList = new ArrayList<String>();
        mArrayList.add("Mercedez");
        mArrayList.add("BMW");
        mArrayList.add("Volvo");
        mArrayList.add("Ford");
        mArrayList.add("Audi");
        System.out.println(mArrayList);
        Iterator<String> it = mArrayList.iterator();
        //Looping through collection
        while(it.hasNext()){
        System.out.println(it.next());
        }
        // System.out.println(it.next());

        //removing elements
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> mit = numbers.iterator();
        while(mit.hasNext()) {
          Integer i = mit.next();
          if(i < 10) {
            mit.remove();
          }
        }
        System.out.println(numbers);
}
}