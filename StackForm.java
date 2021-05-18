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

    // references MrCoxallStack file
    MrCoxallStack clasStack = new MrCoxallStack();
    
    try {
      // receive user input
      for (int counter = 0; counter < 4; counter++) {
        System.out.println("Enter an integer to push onto the stack: ");
        int numberChosen = userInput.nextInt();
        System.out.println();

        // Pushes user input into arraylist in MrCoxallStack
        clasStack.push(numberChosen);
      }
    } catch (Exception e) {
      System.out.println("\nInvalid Input. Try again.");
    }
    // Prints out the current stack
    System.out.print("\nThe numbers in the stack: " + clasStack.showStack());
    // Prints out the last number in the stack
    System.out.print("\nPeeked: " + clasStack.peek());
    // Prints out and removes the last number in the stack
    System.out.print("\nPopped: " + clasStack.pop());
    // Prints out the current stack
    System.out.print("\nThe numbers in the new stack: " + clasStack.showStack());
    System.out.println();
    System.out.println("\nDone");

  }
}
