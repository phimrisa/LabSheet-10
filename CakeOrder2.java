import java.util.Scanner;

public class CakeOrder2 {
    public static String selectFlavor(){
        Scanner scanner = new Scanner(System.in);

        String[] flavors = {"Chocolate","Vanilla","Strawberry","Lemon","Red Velvet"};
        int choice;

        for (int i = 0; i < flavors.length; i++) {
            System.out.println("Press " + (i+1) + " for " + flavors[i]);
        }
        do {
            System.out.print("Enter a flavor number : ");
            choice = scanner.nextInt();
        }
        while (choice < 1 || choice > flavors.length);

        switch (choice) {
            case 1:
                return flavors[0];
            case 2:
                return flavors[1];
            case 3:
                return flavors[2];
            case 4:
                return flavors[3];
            default:
                return flavors[4];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake" +
                "\nPress 2 to order Cup Cake" +
                "\nPress 3 for Choux");
        System.out.print("Enter an option: ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                String flavor = selectFlavor();
                scanner.nextLine();
                System.out.print("\nEnter a message: ");
                String message = scanner.nextLine();
                System.out.print("How many pounds: ");
                int pound = scanner.nextInt();
                BirthdayCake birthday_cake = new BirthdayCake(message, pound, flavor, 350);
                System.out.println();
                System.out.println(birthday_cake);
                break;
            case 2:
                flavor = selectFlavor();
                scanner.nextLine();
                System.out.print("\nHow many pieces: ");
                int piece = scanner.nextInt();
                CupCake cup_cake = new CupCake(piece, flavor, 65);
                System.out.println();
                System.out.println(cup_cake);
                break;
            case 3:
                flavor = selectFlavor();
                scanner.nextLine();
                System.out.print("\nHow many set: ");
                int set = scanner.nextInt();
                Choux choux = new Choux(set, flavor, 120);
                System.out.println();
                System.out.println(choux);
                break;
            default:
                System.out.println("Wrong option!! Try again!!");
                break;
        }
    }
}