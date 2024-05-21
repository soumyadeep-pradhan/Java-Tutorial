public class throwInException {
    static void checkAge(int age){
        if (age<18) {
            throw new ArithmeticException("Access Denied--You must be 18 years old");
        }
        else{
            System.out.println("Access granted");
        }


    }
    public static void main(String[] args) {
        checkAge(19);
    }
}