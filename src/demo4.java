import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {

    public static void main(String[] args) {
        String a = GetXMLValue("<people><name>shopee</name></people>", "people.name");
        System.out.println(a);
    }

    public static String GetXMLValue(String inxml, String path) {
        if (inxml == null || inxml.length() == 0) {
            return "";
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(inxml);
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("[.]");
        while (matcher.find()) {
            stack.push(matcher.group(0));
        }
        System.out.println(stack);
        for (String a : arr) {      //该循环没有进入
            if (a.equals(stack.peek())) {
                stack.pop();
            } else {
                return " ";
            }
        }
        return stack.peek();
    }
}
