import javafx.beans.binding.DoubleBinding;
import junit.framework.Test;
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

    // regex?
    //name[\;|\:|\@|\^|\*|\%])milk|bread|cookies|apples[\;|\:|\@|\^|\*|\%]price[\;|\:|\@|\^|\*|\%]\d\.\d\d[\;|\:|\@|\^|\*|\%]]type[\;|\:|\@|\^|\*|\%]food[\;|\:|\@|\^|\*|\%]expiration[\;|\:|\@|\^|\*|\%]\d/\d\d/\d\d\d\d##

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();

        System.out.println("name: Milk \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"milk") +" times");
        System.out.println("============= \t \t =============");
        System.out.println("Price 3.23 \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"3.23")+" times");
        System.out.println("------------- \t \t -------------");
        System.out.println("Price 1.23 \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"1.23")+" times");
        System.out.println();
        System.out.println("name: Bread \t\t seen: "+new Main().nmbrOfOccurrences(output,"bread")+" times");
        System.out.println("============= \t \t =============");
        System.out.println("name: Price \t\t seen:  times");
        System.out.println("------------- \t \t -------------");
        System.out.println();
        System.out.println("name: Cookies \t\t seen: "+new Main().nmbrOfOccurrences(output,"cookies")+" times");
        System.out.println("============= \t \t =============");
        System.out.println("Price 2.25 \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"2.25")+" times");
        System.out.println("------------- \t \t -------------");
        System.out.println();
        System.out.println("name: Apples \t\t seen: "+new Main().nmbrOfOccurrences(output,"apples")+" times");
        System.out.println("============= \t \t =============");
        System.out.println("Price 0.25 \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"0.25")+" times");
        System.out.println("------------- \t \t -------------");
        System.out.println("Price 0.23 \t\t\t seen: "+new Main().nmbrOfOccurrences(output,"0.23")+" times");
        System.out.println();
        System.out.println("Errors\t\t\t\t seen:  times");



    }


}
