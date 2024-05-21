    enum constants {
    LOW,
    MEDIUM,
    HIGH
} 
public class Level {

    public static void main(String[] args) {
        constants myConstants = constants.MEDIUM;
        switch(myConstants){
            case LOW:
            System.out.println("Low level");
            break;
            case MEDIUM:
            System.out.println("Medium level");
             break;
            case HIGH:
            System.out.println("High level");
             break;
        }
    }
}
