import java.util.Scanner; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class _08_ExtractEmails {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+").matcher(input);
    while (m.find()) {
        System.out.println(m.group());

    }

}
}