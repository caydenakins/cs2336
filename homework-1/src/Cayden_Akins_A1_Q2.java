import java.util.Scanner;                          // Import the Scanner class

public class Cayden_Akins_A1_Q2 {
  public static void main(String[] args) {
    // Create a variable that will be used later to track user input
    Scanner input = new Scanner(System.in);

    // Prompt user to enter integer to use in later calculations
    System.out.print("Enter an integer: ");
    int integer = input.nextInt();

    // Input validation to make sure the user stays within the one digit range
    while (integer < 1 || integer > 9) {
      System.out.println();
      System.out.println("Please enter a number between 1 and 9 (inclusive)");
      System.out.print("Enter an integer: ");
      integer = input.nextInt();
    }

    System.out.println();

    // For loop and nested for loop that increment with the rows required
    for (int i = 1; i <= integer; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);      // Print the integer to the screen
      }
      System.out.println();       // Go to the next row
    }


  }
}
