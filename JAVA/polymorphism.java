class Animal {
    public void AnimalSound(){
        System.out.println("This animal makes sound");
    }
}
class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("The dog says: Bow wow");
    }
}
class Cat extends Animal{
    public void AnimalSound(){
        System.out.println("The cat says: Meow meow");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myAnimal.AnimalSound();
        myDog.AnimalSound();
        myCat.AnimalSound();
    }
}
