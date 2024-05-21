import java.util.ArrayList;

public class wrapperClasss {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        //int --> Integer
        //boolean --> Boolean
        // To use primitive data types as objects
        myArrayList.add(25);
        myArrayList.add(72);
        myArrayList.add(85);
        myArrayList.add(98);
        System.out.println(myArrayList);

    }
}
