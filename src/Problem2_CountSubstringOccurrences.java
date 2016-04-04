import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine().toLowerCase();
        String s = in.nextLine();

        String rep ="["+ s + "]+";

        Pattern pattern = Pattern.compile(rep);
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()) {
            matcher.group();
            count++;
        }
        System.out.println(count);

    }
}
