import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char arr[] = new char[str.length()];
        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            arr[j] = str.charAt(i);
            j++;
        }

        for (char c : arr) {
            System.out.print(c);
        }

        System.out.println();
        boolean flag = true;
        System.out.println("Enter your Mobile number: ");

        while (flag) {
            String str1 = sc.nextLine();
            if (str1.matches("[6-9][0-9]{9}")) {
                System.out.println("Your number succesfully registered");
                flag = false;
            } else {
                System.out.println("please enter valid number");
            }
        }
        sc.close();
    }
}