package String;

import java.util.Scanner;

public class stringReverse {
    public static void reverseByLogic(String str) {
        char[] strArr = str.toCharArray();

        int l = 0;
        int r = strArr.length - 1;

        while (l < r) {
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;

            l++;
            r--;
        }
        String reverse = new String(strArr);

        if (str.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not paindrome");
        }
    }

    public static void reverseByMethod(String str) {

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not paindrome");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");

        String str = sc.nextLine();

        reverseByMethod(str);
        reverseByLogic(str);

        sc.close();
    }
}
