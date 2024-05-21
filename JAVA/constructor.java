public class constructor {
    int x;
    public constructor(int y){
        x = y;
    }
    public static void main(String[] args) {
        constructor myObject = new constructor(45);
        System.out.println(myObject.x);
    }
}
