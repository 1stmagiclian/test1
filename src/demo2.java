import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");     //要是输入的字符串有空格，那就将空格作为分隔符进行分别研究，没有的话只执行一次for循环，也不会有影响
        //循环就是遍历每个string[i]
        for (int i = 0; i < strings.length; i++) {
            //定义一个最终的数字
            int count = 0;
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) >= '0' && strings[i].charAt(j) <= '9') {
                    count = count * 10 + strings[i].charAt(j) - '0';
                } else {
                    if (count >= 1000 && count <= 3999) {
                        System.out.print(count + " ");
                    }
                    count = 0;
                }
            }
            if (count >= 1000 && count <= 3999) {  //为了防止上面的for循环中无法输出2022数字后面为空的情况
                System.out.print(count + " ");
            }
        }
    }
}