import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner and variable for user inputted number
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        String repeat = null;

        System.out.println("Learn your Squares and Cubes!");

        do {
            System.out.print("Please enter a number: ");
            while (!scnr.hasNextInt()) {
                System.out.println("That is not a number. Please enter a number.");
                scnr.next();
            }
            userNum = scnr.nextInt();

            //Print format that apparently prints in a table? ASK ABOUT THIS
            System.out.printf("%-22s%-22s%-22s\n", "Number", "Squared", "Cubed");
            System.out.printf("%-22s%-22s%-22s\n", "======", "======", "======");

            //for Loop for Squared & Cubed
            for (int i = 1; i <= userNum; i++) {
                int square;
                int cube;

                square = (i * i);
                cube = (i * i * i);

                System.out.printf("%-22s%-22s%-22s\n", i, square, cube);

            }

            //Repeat code along with validation
            System.out.print("Would you like to continue? (Y/N): ");
            repeat = scnr.next();

        }while(!repeat.equalsIgnoreCase("N"));

        System.out.print("Thanks for playing! Goodbye!");

    }
}
