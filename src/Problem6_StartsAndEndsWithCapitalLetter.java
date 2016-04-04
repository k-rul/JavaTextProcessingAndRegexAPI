import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String p = "\\b[A-Z][a-zA-Z]*[A-Z]\\b";

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.printf("%s ",matcher.group());
        }
    }
}
