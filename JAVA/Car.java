class inheritance {
protected String Brand = "BMW";
public void honk(){
    System.out.println("Tuut, Tuut!");
}    
}
class Car extends inheritance{
    private String model = "X7";
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.honk();
        System.out.println("My car is "+myFirstCar.Brand+myFirstCar.model);
    }
}