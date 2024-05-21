import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("Soumyadeep", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher = myPattern.matcher("I am going to introduce you a genius student. He is Soumyadeep Pradhan. He has amazing skill sets.");
        boolean myBoolean = myMatcher.find();
        if (myBoolean) {
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}
