/**
* This program prompts the user to enter two intergers then
* calls other method to calculate those numbers. 
* @author: Vananh Vo 
* Source: methodExample.java
*/
public class methodExample {
  public static int productOfTwoIntegers (int number1,int number2) {
	  int product;
	  product = number1 * number2;
	  return product;
  }
  public static void main (String[] args) {
	  int product, number1, number2;
	  Scanner userInput = new scanner(System.in);
	  System.out.println(“Please enter two integers: ”);
	  while (userInput.hasNextInt()){
	    number1 = userInput.nextInt();
	    number2 = userInput.nextInt();
	  }
	product = productOfTwoIntegers (number1, number2);
	System.out.printf(“%d is the product of %d and %d”, product,                              
			number1, number2);
  }
}
