import java.util.ArrayList;
import java.util.Collections;
public class loopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedez");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");
        cars.add("Lamorghini");
        Collections.sort(cars);
    //   for (int i = 0; i < cars.size(); i++) {
    //   System.out.println(cars.get(i));
    // }
    for(String i : cars){
        System.out.println(i);
    }
}
}
