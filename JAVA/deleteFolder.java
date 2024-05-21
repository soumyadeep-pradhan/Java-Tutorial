import java.io.File;

public class deleteFolder {
    public static void main(String[] args) {
        File myFolder = new File("New");
        if (myFolder.delete()) {
            System.out.println("Folder deleted: "+myFolder.getName());
        } else {
            System.out.println("Failed to delete folder");
        }
    }
}
