import java.io.*;
import java.util.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String s1 = "listen";
        String s2 = "silent";

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (a.equals( b))
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
}