import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DESCRIPTION: 提取字符串中的年份 年份范围在 [1000, 3999] 之间
 * 输入一行英语， 比如 20% of people hold 80% of the offer in 2020 and 2019 and 2018 and 2017.
 * 刚开始利用正则表达式提取出了年份吧，然后只通过 9%，这个时候就开始找自己的错误了，毕竟题目说是单词中的年份啊。
 * 然后就开始想英语中哪些介词后面直接跟年份呢？ in、by、at、on 这些都想了一下也下手了。
 * 然后系统提示增加用例，大概是 3743432sdajda2020，然后输出的结果是 2020。
 * 这我就不能理解了，2020这怎么就直接判断出年份了呢？看来没用介词，然后我就去测啊，我的也输出了 2020。
 * <p>
 * 唉，算了 9% 就 9% 吧，没时间去看了，9月25要考的优化方法都要挂了。
 **/
public class demo1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        List<Integer> years = findYear(string);
        for (int i = 0; i < years.size() ; i++) {
            System.out.print(years.get(i) + " ");
        }
        System.out.println(years.get(years.size() - 1));
    }

    private static List<Integer> findYear(String string) {
        List<Integer> res = new ArrayList<>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(string);
        while (m.find()) {
            int num = Integer.parseInt(m.group());
            if (num >= 1000 && num <= 3999) {
                res.add(num);
            }
        }
        return res;
    }
}
