import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
      try {
        File myObj = new File("HelloNEW.java");
        if (myObj.createNewFile()) {
            System.out.println("File is created: "+myObj.getName());
        } else {
            System.out.println("File already exists");
        }
      } catch (IOException e) {
       System.out.println("An error occured");
       e.printStackTrace();
      }
        
    }
}
