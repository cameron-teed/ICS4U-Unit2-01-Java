/*
* This class creates an arraylist that will recieve input from a class.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-17
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {

  /**
  * Initializes the array.
  */
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  /**
  * This method receives the number inpputed by the user.
  *
  * @param pushNumber
  */
  public void push(final int pushNumber) {
    stackAsArray.add(pushNumber);
  }
  
  public void showStack() {
  	// Retrieves value from arraylist in MrCoxallStack
    System.out.println("Pushed: " + stackAsArray);
  }
}
