package cse360assignment02;
/*In this assignment,we will implement an AddingMachine classs
 * In the AddingMachine class, we will use to calculate the total by having getTotal function
 * add method, subtract method,toString method
 * In this version, rather then declare the function like at the initial version , we will 
 * take the current total value and do some calculate such as adding, subtracting with the passing parameters.
 * Name: Kim Kieu Pham*/
public class AddingMachine {
  private int total;
  private StringBuilder historyOfTransaction;//create a string of history to keep the history of transaction to be returned 

  /*create a AddingMachine function */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    historyOfTransaction = new StringBuilder("0");/*using stringBuilder to append the string value together
    can use stringBuffer in this case to concatenation */
  }
  /*the getTotal will return the total value by taking the current total value  */
  public int getTotal () {
	    return total;//return the current total value 
  }
  /* add function will add the parameter value that pass in the function to the current total */
  public void add (int value) {
	  total = total + value; // add the value parameter to the total variable
	  historyOfTransaction.append(" + " + value); /* append the value and "+" to the previous string in the stringbuilder */
  }
  /* subtract function will take the current total and subtract the value passing in the parameter */
  public void subtract (int value) {
	  total = total - value;//subtract the value parameter from the total 
	  historyOfTransaction.append(" - " + value);/* append the value and "-" to the previous string in the stringbuilder */

  }
/* toString function will return the string of the history calculation */
  public String toString () {
	    return historyOfTransaction.toString(); /*calling toString() in order to display the math */
  }

  public void clear() {
  }
}