import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter myObj = new FileWriter("HelloNEW.java");
        myObj.write("\\n" + //
                " public class HElloNEW{\\n" + //
                "public static void main{\\n" + //
                " System.out.println('Hello')}}\"");
        myObj.close();
        System.out.println("Successfully wrote");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
