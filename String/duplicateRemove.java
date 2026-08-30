package String;

import java.util.Scanner;

public class duplicateRemove {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        String unique = " ";

        for (int i = 0; i < str.length(); i++) {
            if (unique.indexOf(str.charAt(i)) == -1) {
                unique += str.charAt(i);
            }
        }

        System.out.print("Unique String is " + unique);

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your String: ");
        // try {
        // String str = sc.nextLine();
        // String unique = "";

        // for (int i = 0; i < str.length(); i++) {
        // if (unique.indexOf(str.charAt(i)) == -1) {
        // unique += str.charAt(i);
        // }
        // }

        // System.out.print("Unique String is " + unique);
        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // }

        // sc.close();

    }

}
