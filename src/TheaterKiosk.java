import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        int userAge;
        int MIN_AGE = 21;

        //asks the user their age
        System.out.println("What is your age?");
        //checks and outputs the correct response
        if (scan.hasNextInt()) {
            userAge = scan.nextInt();
            if (userAge >= MIN_AGE) {
                System.out.println("You get a wristband!");
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("You have entered an invalid data type.");
            System.exit(0);
        }
    }
}