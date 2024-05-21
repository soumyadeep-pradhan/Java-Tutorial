import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Mercedez");  
      cars.add("BMW");  
      cars.add("Audi");  
      System.out.println(cars);
      cars.set(2, "McLaren");
    // System.out.println(cars.get(2));
    cars.remove(1);
    System.out.println(cars);
    System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
}
}
