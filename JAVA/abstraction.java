abstract class Animal{
    public abstract void AnimalSound();
    public void sleep(){
        System.out.println("Zzz Zzz !!");
    }
}

class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("Pig Says: Wee Wee");
    }
}


public class abstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.AnimalSound();
        myPig.sleep();
    }
}
