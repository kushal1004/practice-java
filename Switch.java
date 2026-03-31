import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Day: ");
        String day = sc.nextLine();

        switch(day){
            case "sunday","saturday" :
                System.out.println("Weekend");
                break;
            case "monday","wednesday","friday":
                System.out.println("You have to attend office");
                break;
            case "tuesday","thursday" :
                System.out.println("Work from home");
                break;
            default:
             System.out.println("enter a valid date, with all small letter, Thank you");
        }

        sc.close();
    }
}
