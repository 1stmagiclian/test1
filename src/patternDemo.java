import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternDemo {

    public static void main(String[] args) {
        //String xml = "<people><name>shopee</name></people></age>";
        Scanner sc = new Scanner(System.in);
        String xml = sc.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(xml);
        Stack<String> stack = new Stack<>();
        while (matcher.find()) {
            stack.push(matcher.group(0));
        }
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
    }
}
