public class accessMethodWithObject {
    public void fullThrottle(){
        System.out.println("The car will run at maximum speed");
    }
    public void maxSpeed(int speed){
        System.out.println("The car will move at max speed"+speed);
    }
    public static void main(String[] args) {
        accessMethodWithObject myObject = new accessMethodWithObject();
        myObject.fullThrottle();
        myObject.maxSpeed(500);
    }
}
