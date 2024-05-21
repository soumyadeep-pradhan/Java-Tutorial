import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        String username;
        System.out.println("Enter your name");
        username = myObject.nextLine();
        System.out.println("Your name is "+username);
    }
}
