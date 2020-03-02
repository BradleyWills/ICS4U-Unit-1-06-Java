import java.util.Random;
import java.util.Scanner;

/**
* The RandomNumGen program implements an application that generates a random 
* number based on the inputed max.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-01 
*/

public class RandomNumGen {
  // Create variables 
  static int randomizedNum;
  static int maxValueInput;
  
  /**
   * Generates a random number.
   */
  
  
  public static void rollDie(int maxValue) {
    Random randomizer = new Random();
    // Generate random number 1-maxValue
    randomizedNum = (randomizer.nextInt(maxValue)) + 1;
    // Prints the random number
    System.out.println(randomizedNum);
  }
  
  /**
  * Calculates and checks if the users input is the same as the guess.
  */
  
  public static void main(String[] args) {
    // Create scanner and randomizer
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the max value.");
    try {
      maxValueInput = Integer.parseInt(userInput.nextLine());
      // Calls the function
      rollDie(maxValueInput);
    } catch (Exception e) {
      // Informs the user that their input is invalid
      System.out.println("Invalid Input.");
    }
  }
}