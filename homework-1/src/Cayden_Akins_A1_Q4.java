import java.util.Scanner;                      // Import the Scanner class

public class Cayden_Akins_A1_Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    // Variable used for user input

    // Integers used to track Diana's distance swam in 5 events
    int distanceSwam1974 = 0;
    int distanceSwam1975 = 0;
    int distanceSwam1978 = 0;
    int distanceSwam1979 = 0;
    int distanceSwam2013 = 0;

    // Integers used to track Diana's time to swim a distance in 5 events
    int hoursSwam1974 = 0;
    int hoursSwam1975 = 0;
    int hoursSwam1978 = 0;
    int hoursSwam1979 = 0;
    int hoursSwam2013 = 0;

    // Doubles used to calculate Diana's speed in 5 different events
    double speed1974 = 0;
    double speed1975 = 0;
    double speed1978 = 0;
    double speed1979 = 0;
    double speed2013 = 0;

    // Doubles used to calculate Diana's average speed across all 5 events
    double averageSpeed = 0;

    // Get the distance swam and hours taken to swim in the 1974 competition
    System.out.println("Enter the distance Diana Nyad swam in 1974:");
    distanceSwam1974 = input.nextInt();
    System.out.println("How many hours did it take Nyad to swim the distance?");
    hoursSwam1974 = input.nextInt();

    // Get the distance swam and hours taken to swim in the 1975 competition
    System.out.println("Enter the distance Diana Nyad swam in 1975:");
    distanceSwam1975 = input.nextInt();
    System.out.println("How many hours did it take Nyad to swim the distance?");
    hoursSwam1975 = input.nextInt();

    // Get the distance swam and hours taken to swim in the 1978 competition
    System.out.println("Enter the distance Diana Nyad swam in 1978:");
    distanceSwam1978 = input.nextInt();
    System.out.println("How many hours did it take Nyad to swim the distance?");
    hoursSwam1978 = input.nextInt();

    // Get the distance swam and hours taken to swim in the 1979 competition
    System.out.println("Enter the distance Diana Nyad swam in 1979:");
    distanceSwam1979 = input.nextInt();
    System.out.println("How many hours did it take Nyad to swim the distance?");
    hoursSwam1979 = input.nextInt();

    // Get the distance swam and hours taken to swim in the 2013 competition
    System.out.println("Enter the distance Diana Nyad swam in 2013:");
    distanceSwam2013 = input.nextInt();
    System.out.println("How many hours did it take Nyad to swim the distance?");
    hoursSwam2013 = input.nextInt();

    System.out.println();

    // Calculate Diana's speed using distance, speed, and explicit type casting
    speed1974 = (double) distanceSwam1974 / hoursSwam1974;
    speed1975 = (double) distanceSwam1975 / hoursSwam1975;
    speed1978 = (double) distanceSwam1978 / hoursSwam1978;
    speed1979 = (double) distanceSwam1979 / hoursSwam1979;
    speed2013 = (double) distanceSwam2013 / hoursSwam2013;

    // Calculate the average speed of Diana in all her races
    averageSpeed = (speed1974 + speed1975 + speed1978 + speed1979
        + speed2013) / 5;


    // Print the output in a tabular format
    System.out.println("+-----------------------------------------------------"
        + "------------+");
    System.out.println("| Year   | Distance (miles)  | Time (hours) | Speed (m"
        + "iles/hour)  |");
    System.out.println("+-----------------------------------------------------"
        + "------------+");
    System.out.println("  1974   | " + distanceSwam1974
        + " miles          | " + hoursSwam1974
        + " hours      | " + speed1974);
    System.out.println("  1975   | " + distanceSwam1975
        + " miles          | " + hoursSwam1975
        + " hours      | " + speed1975);
    System.out.println("  1978   | " + distanceSwam1978
        + " miles          | " + hoursSwam1978
        + " hours     | " + speed1978);
    System.out.println("  1979   | " + distanceSwam1979
        + " miles         | " + hoursSwam1979
        + " hours     | " + speed1979);
    System.out.println("  2013   | " + distanceSwam2013
        + " miles         | " + hoursSwam2013
        + " hours     | " + speed2013);

    System.out.println();

    System.out.println("Diana Nyad's average speed is: " + averageSpeed
        + " miles/hour.");

  }
}
