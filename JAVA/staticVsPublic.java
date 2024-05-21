public class staticVsPublic {
    public void myPublicMethod(){
        System.out.println("It can only be accessed by creating object");
    }
    static void myStaticMethod(){
        System.out.println("It can be accessed without creating object");
    }
    public static void main(String[] args) {
        myStaticMethod();
        staticVsPublic myObj = new staticVsPublic();
        myObj.myPublicMethod();

    }
}
