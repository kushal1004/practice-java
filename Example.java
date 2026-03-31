public class Example {
    public static void main(String[] args) {
        String str = "Java";
        str.concat("world");
        System.out.println(str);
        String str1 = new String("Java");
        if (str == str1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(str.equals(str1));
    }
}