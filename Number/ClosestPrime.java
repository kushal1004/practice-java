// I have asked this question in OneBanc technical interview ; level is easy
package Number;
import java.util.*;

public class ClosestPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is prime number");
            sc.close();
            return;
        }

        int lower = n - 1;
        int higher = n + 1;

        while (!isPrime(lower)) {
            lower--;
        }
        while (!isPrime(higher)) {
            higher++;
        }

        if ((n - lower) <= (higher - n)) {
            System.out.println(lower + " is the closest prime number of " + n);
        } else {
            System.out.println(higher + " is the closest prime number of " + n);
        }

        sc.close();
    }
}
