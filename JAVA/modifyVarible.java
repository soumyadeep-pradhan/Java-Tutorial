public class modifyVarible {
   int x = 5;
   //final int x =5; we cant modify x further
    public static void main(String[] args) {
        modifyVarible myObj1 = new modifyVarible();
        modifyVarible myObj2 = new modifyVarible();
        myObj1.x = 10;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
