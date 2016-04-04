import java.util.Scanner;

public class Problem2_CountSubstringOccurrences {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine().toLowerCase();
        String find = in.nextLine().toLowerCase();
        int lengthWord = find.length();

        int count = 0;
        for (int i = 0; i <= text.length() - lengthWord; i++) {
            if (find.equals(text.substring(i, i + lengthWord))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
