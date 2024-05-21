class OuterClass{
    int x = 4;
    class InnerClass{
        int y = 7;
    }
}
public class nestedclass{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x+myInner.y);
    }
}