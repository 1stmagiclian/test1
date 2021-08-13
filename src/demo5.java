public class demo5 {
    public static void main(String[] args) {
        String[] arrs = {"11aa1", "11a2"};
        System.out.println(longestCommonPrefix(arrs));
    }

    public static String longestCommonPrefix(String[] strs) {
        // write code here
        if (strs == null || strs.length == 0) {
            return "";
        }
        String min = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            while (strs[i].indexOf(min) != 0) //indexOf返回第一次出现的位置，不为-1则存在
                min = min.substring(0, min.length() - 1);  //substring是左闭右开
            i++;
        }
        return min;
    }

}
