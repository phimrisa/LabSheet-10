import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        //No.1
        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.nextLine();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        //No.2
        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        //No.3
        System.out.println(order1);

        System.out.println();

        //No.4
        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cup_cake_flavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();

        //No.5
        CupCake order2 = new CupCake(piece, cup_cake_flavor, 65);

        //No.6
        System.out.println(order2);

        System.out.println();
*/
        System.out.println("Choux's Details:");
        System.out.print("Enter a flavor: ");
        String choux_flavor = scanner.next();
        System.out.print("How many set: ");
        int set = scanner.nextInt();

        Choux order3 = new Choux(set, choux_flavor, 120);

        System.out.println(order3);

        //No.7
        //System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice()));
        System.out.println("Total price = " + (order3.calculateTotalPrice()));
    }
}