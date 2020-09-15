import java.util.Scanner;

/**
 * The program will ask for two integers, then will output them in ascending order
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the first integer
    System.out.println("Please enter an integer:");

    // declare and initialize first integer
    int integer1 = input.nextInt();

    // ask the user for the second integer
    System.out.println("Please enter another integer:");

    // declare and initialize second integer
    int integer2 = input.nextInt();

    // find the biggest number
    if(integer1 < integer2){
      System.out.println("Your numbers in ascending order are " + integer1 + ", " + integer2);
    } else {
      System.out.println("Your numbers in ascending order are " + integer2 + ", " + integer1);
    }
  
  }
}
