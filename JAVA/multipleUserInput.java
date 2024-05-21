import java.util.Scanner;
public class multipleUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name, Age, Salary");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double Salary = myObj.nextDouble();

        System.out.println("Your name: "+name);
        System.out.println("Your age: "+age);
        System.out.println("Your salary: "+Salary);
    }
}
