/*
* This program pushes a user input to a program with a class containing an
* arraylist. Then prints out what number you pushed to the stack.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-17
*/

// Import the Scanner class
import java.util.Scanner;

public final class StackForm {

  private StackForm() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * This program recieves input and adds values onto the stack.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);

    // ensures that user inputs only integer values
    try {
      // receive user input
      System.out.println("Enter an integer to push onto the stack: ");
      int numberChosen = userInput.nextInt();
      System.out.println();

      // references MrCoxallStack file
      MrCoxallStack clasStack = new MrCoxallStack();

      // Pushes user input into arraylist in MrCoxallStack
      clasStack.push(numberChosen);

      // call method
      clasStack.showStack();

      System.out.println("\nDone");

    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
