import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public String JerkSon(String regex, String input){

        Pattern parser = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher m = parser.matcher(input);


        return null;
    }
}
