import java.util.Scanner;

public class Problem4_CountAllWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split("\\P{Alpha}+");

        System.out.println(s.length);
    }
}
