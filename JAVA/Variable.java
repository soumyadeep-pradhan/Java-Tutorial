public class Variable {
    public static void main(String[] args) {
        double mycgpa = 8.92;
        System.out.println(mycgpa);
        String MyName = "Soumyadeep";
        System.out.println(MyName);
        int x = 5;
        int y = 4;
        System.out.println(x+y);
        byte l = 54;
        short k = 6;
        int n = 9;
        long b = 7L;
        System.err.println(l+k+n+b);

        double mydouble = 78.96d;
        int newdouble = (int)mydouble;
        System.out.println(mydouble);
        System.out.println(newdouble);
        System.out.println(8>9);

        String[] cars = {"BMW","Mercedes","Audi"};
        for (String i : cars) {
        System.out.println(i);
        }
    }
}
