import java.util.Scanner;                      // Import the Scanner class

public class Cayden_Akins_A1_Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    // Variable for user input
    int integer = 0;                           // Integer receiving user input
    int modifiedInteger = 0;                   // Integer used to copy values
    int output = 0;                            // Integer for our output

    // Get the user's desired input value
    System.out.print("Input number: ");
    integer = input.nextInt();

    // User input validation to confirm they are not using a number less than 0
    while (integer < 1) {
      System.out.println("Please enter an integer greater than 0");
      System.out.print("Input number: ");
      integer = input.nextInt();
    }

    modifiedInteger = integer;                 // Copy input value to modify

    // For loop that calculates our desired output using a formula on line 27
    for (int i = 0; i < 4; i++) {
      output += modifiedInteger;
      modifiedInteger = (modifiedInteger * 10) + integer;
    }

    // Print our output we achieved
    System.out.print(integer + " + "
        + integer + integer + " + "
        + integer + integer + integer + " + "
        + integer + integer + integer + integer + " = "
        + output);

  }
}
