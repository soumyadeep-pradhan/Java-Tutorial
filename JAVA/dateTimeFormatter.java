import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formatted "+myDateTime);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("E dd-MM-yy HH mm ss");
        String formattedDate = myDateTime.format(myFormatter);
        System.out.println("After formatted "+formattedDate);
    }
}
