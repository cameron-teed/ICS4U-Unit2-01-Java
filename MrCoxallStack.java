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

  /**
  * This method pops the top number of the array.
  * 
  * @return poppedNumber
  */
  public int pop() {
    // Removes the top number in the stack and returns it
    int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
    stackAsArray.remove(stackAsArray.size() - 1);
    return poppedNumber;
  }

  /**
  * This method peeks the top number in the stack.
  *
  * @return peekNum
  */
  public int peek() {
    // Gets the top number in the stack
    int peekNum = 0;
    peekNum = this.stackAsArray.get(stackAsArray.size() - 1);
    return peekNum;
  }

  /**
  * This method prints out the stack.
  *
  * @return userStack
  */
  public String showStack() {
    // Adds the elements in the array to a string and returns it
    String userStack = "";
    for (int counter = 0; counter != stackAsArray.size(); counter++) {
      if (counter != stackAsArray.size() - 1) {
        userStack = userStack + stackAsArray.get(counter) + ", ";
      } else {
        userStack = userStack + stackAsArray.get(counter);
      }
    }
    return userStack;
  }
}