import java.util.Scanner;

public class IT26102429Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int n3 = sc.nextInt();
        
        int largest = n1;
        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        
        int smallest = n1;
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
        
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}