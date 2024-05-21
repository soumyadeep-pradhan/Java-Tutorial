class OuterClass{
    int x = 4;
    public class InnerClass{
        public int myMethod(){
            return x;
        }
    }
}



public class accessOuterClassFromInnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myMethod());
    }
}
