class OuterClass{
    int x = 5;
    static class InnerClass{
        int y = 6;
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass myInnerObj = new OuterClass.InnerClass();
        System.out.println(myInnerObj.y);
    }
}
