import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public Integer nmbrOfOccurrences(String string, String word){
        int count = 0, startIndex = 0;

        Pattern p = Pattern.compile(word, Pattern.CASE_INSENSITIVE+Pattern.LITERAL);
        Matcher m = p.matcher(string);

        while(m.find(startIndex)){
            count++;
            startIndex = m.start() + 1;
        }
        return count;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();

        System.out.println("name: \t Milk \t\t seen: "+new Main().nmbrOfOccurrences(output,"milk") +" times");
        System.out.println("============= \t \t =============");
        System.out.println("name: \t Bread \t\t seen: "+new Main().nmbrOfOccurrences(output,"bread")+" times");
        System.out.println("============= \t \t =============");
        System.out.println("name: \t Cookies \t seen: "+new Main().nmbrOfOccurrences(output,"cookies")+" times");
        System.out.println("============= \t \t =============");
        System.out.println("name: \t Apples \t seen: "+new Main().nmbrOfOccurrences(output,"apples")+" times");
        System.out.println("============= \t \t =============");


    }


}
