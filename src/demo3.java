//import java.util.Scanner;
//
//public class demo3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int temp = 0;
//        for (Integer i = 2; i < Integer.MAX_VALUE; i ++ ) {
//            String tmp = i.toString();
//            tmp = tmp.replace("2","").replace("3", "").replace("5", "");
//            if (tmp.length() == 0) {
//                temp++;
//            }
//            if (temp == n) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        StringBuffer buffer = new StringBuffer();
        while(n!=0) {
            int temp = (n-1)%3;
            if(temp==0) {
                buffer.append(2);
            }else if(temp==1) {
                buffer.append(3);
            }else {
                buffer.append(5);
            }
            n = (n-1)/3;
        }
        buffer.reverse();
        System.out.println(buffer.toString());
    }
}
