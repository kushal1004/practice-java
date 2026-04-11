import java.util.Scanner;

public class MergedStringAlternately {

    public static String merged(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();
        int max = Math.max(length1, length2);

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        for (int i = 0; i < max; i++) {
            if (i < length1) {
                sb.append(w1[i]);
            }
            if (i < length2) {
                sb.append(w2[i]);
            }
        }

        return sb.toString();
    }

    public static String mergedString(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();
        int min = Math.min(length1, length2);

        String longestString = "";

        if (min == length1) {
            longestString = word2;
        } else if (min == length2) {
            longestString = word1;
        }

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        for (int i = 0; i < min; i++) {
            sb.append(w1[i]);
            sb.append(w2[i]);
        }

        sb.append(longestString.substring(min));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String word1 = sc.next();
        System.out.println("Enter your Second String: ");
        String word2 = sc.next();

        // String result = MergedStringAlternately.mergedString(word1, word2);
        String result = MergedStringAlternately.merged(word1, word2);

        System.out.println("After merge String is: " + result);

        sc.close();
    }
}
