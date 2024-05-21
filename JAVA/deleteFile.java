import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File myFile  = new File("DoIt.txt");
        if (myFile.delete()) {
            System.out.println("File deleted: "+myFile.getName());
        }else{
            System.out.println("failed to delete the file");
        }
    }
}
