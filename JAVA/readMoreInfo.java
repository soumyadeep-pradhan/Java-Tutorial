import java.io.File;

public class readMoreInfo {
    public static void main(String[] args) {
      
            File myFile = new File("firstFile.txt");
            if (myFile.exists()) {
                System.out.println("File name: "+myFile.getName());
                System.out.println("File path: "+myFile.getAbsolutePath());
                System.out.println("Readable: "+myFile.canRead());
                System.out.println("Writable: "+myFile.canWrite());
                System.out.println("File size in bytes: "+myFile.length());
            }
            else{
                System.out.println("File does not exist");
            }
      
        }
}
