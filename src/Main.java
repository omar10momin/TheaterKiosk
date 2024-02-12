import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("You get a wrist band.");
        } // The program does nothing if the user is not 21 or older

        in.close();  // Close the Scanner object
    }
}

