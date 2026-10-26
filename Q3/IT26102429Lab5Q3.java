import java.util.Scanner;

public class IT26102429Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.00;
        final int DISCOUNT_3_4 = 10;
        final int DISCOUNT_5 = 20;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (1-31): ");
        int start = sc.nextInt();
        System.out.print("Enter end date (1-31): ");
        int end = sc.nextInt();
        
        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Date should be between 1 and 31");
            return;
		}
      
       	if (start >= end) {
            System.out.println("Error: Start date should be less than end date");
            return;
        }
        
        int days = end - start;
        
        days = end - start + 1;
        
        double total = days * ROOM_CHARGE;
        double discount = 0;
        
        if (days >= 3 && days <= 4) {
            discount = total * DISCOUNT_3_4 / 100;
        } else if (days >= 5) {
            discount = total * DISCOUNT_5 / 100;
        }
        
        double pay = total - discount;
        
        System.out.println("Number of days reserved: " + days);
        System.out.println("Discount: Rs " + discount);
        System.out.println("Total amount to be paid: Rs " + pay);
    }
}