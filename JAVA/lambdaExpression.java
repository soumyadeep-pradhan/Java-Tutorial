import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(4);
        myArrayList.add(8);
        myArrayList.add(1);
        myArrayList.add(9);
        myArrayList.add(5);
        // myArrayList.forEach((n)->{System.out.println(n);});
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        myArrayList.forEach(method);
    }
}
