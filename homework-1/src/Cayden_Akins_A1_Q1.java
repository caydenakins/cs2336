public class Cayden_Akins_A1_Q1 {
  public static void main(String[] args) {
    int row = 1;               // Counter used to increment in loops
    int rowMax = 15;           // Total number of rows in the flag
    int columnMax = 46;        // Total number of columns in the flag
    int starColumnMax = 12;    // Total number of star columns in the flag
    int starRowMax = 9;        // Total number of star rows in the flag

    // Loop used to increment through the rows of the flag
    while (row <= rowMax) {
      int column = 1;        // Counter used to increment in loops
      // Loop used to increment through columns in the rows of the flag
      while (column <= columnMax) {
        // Check if we are less within the applicable columns
        // and rows to input star characters to the flag
        if (column <= starColumnMax && row <= starRowMax) {
          if (row % 2 == 1) {           // Odd rows (1, 3, 5...)
            System.out.print("* ");
            column += 2;
          } else if (row % 2 == 0) {    // Even rows (2, 4, 6...)
            // We must add a double space on even rows after the 10th character
            if (column < 10) {
              System.out.print(" *");   // If we haven't reached 10th character
            } else {
              System.out.print("  ");   // If we reached the 10th character
            }
            column += 2;
          }
        } else {
          System.out.print("=");        // When we pass last star row/column,
          column++;                     // we fill rest of the flag with `=`
        }
      }

      System.out.println("");           // Start a new row
      row += 1;                         // Increment the row counter by 1
    }
  }
}
