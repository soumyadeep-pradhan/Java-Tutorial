interface firstInterface{
    public void myMethod();
}
interface secondInterface{
    public void myOtherMethod();
}
class DemoClass implements firstInterface, secondInterface{
    public void myMethod(){
        System.out.println("Some text.....");
    }
    public void myOtherMethod(){
        System.out.println("Some other text.......");
    }
}
public class multipleInterface {
    public static void main(String[] args) {
        DemoClass myClass = new DemoClass();
        myClass.myMethod();
        myClass.myOtherMethod();
    }
}
