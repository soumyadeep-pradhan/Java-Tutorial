public class constructorParameter {
    int topSpeed;
    String Name;

    public constructorParameter(int x, String y){
        topSpeed =x;
        Name = y;
    }
    public static void main(String[] args) {
        constructorParameter myNewCar = new constructorParameter(400, "Ferrari");
        System.out.println("My new car is "+myNewCar.Name+" and its top speed is "+myNewCar.topSpeed);
    }
}
