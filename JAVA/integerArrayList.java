import java.util.*;
public class integerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(4);
        numbers.add(7);
        Collections.sort(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }
}
