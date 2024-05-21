public class methodOverload {
    static int Addition(int x, int y){
        return x+y;
    }
    static float Addition(float x, float y){
        return x+y;
    }
    static double Addition(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(Addition(2, 5));
        System.out.println(Addition(5.9, 6.3));
        System.out.println(Addition(2.6448, 5.878));

    }
}
