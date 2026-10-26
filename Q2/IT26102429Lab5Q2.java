import java.util.Scanner;

public class IT26102429Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of new members: ");
        int members = sc.nextInt();
        
        if (members < 0) {
            System.out.println("Invalid Input. Number should be >= 0");
            return;
        }
        
        String prize;
        switch (members) {
            case 0: prize = "No Prize"; break;
            case 1: prize = "Pen"; break;
            case 2: prize = "Umbrella"; break;
            case 3: prize = "Bag"; break;
            case 4: prize = "Travelling Chair"; break;
            default: prize = "Headphone"; break;
        }
        System.out.println("Prize: " + prize);
    }
}