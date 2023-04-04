package basic;

import java.util.Scanner;

class InputOutput {
  public static void main(String[] args) {
    System.out.println("IO in Java");

    /**
     * *** OUTPUT ***
     */
    // using unicode characters
    char zero = '\u0101';
    byte marks = 99;
    System.out.println("print msg and go to new line. " + zero);
    System.out.print("print msg and stay in same line:- ");
    System.out.println(marks);
    System.out.printf("My marks is %d\n", marks);

    /**
     * *** INPUT ***
     */

    // create an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an age: ");
    // take input from the user
    int age = input.nextInt();
    System.out.println("You entered " + age);
    if (age >= 18) {
      System.out.println("Go for Voting");
    } else {
      System.out.println("Wait and Learn");
    }

    // Getting float input
    System.out.print("Enter float: ");
    float myFloat = input.nextFloat();
    System.out.println("Float entered = " + myFloat);

    // Getting double input
    System.out.print("Enter double: ");
    double myDouble = input.nextDouble();
    System.out.println("Double entered = " + myDouble);

    // Getting String input
    System.out.print("Enter text: ");
    String myString = input.next();
    System.out.println("Text entered = " + myString);

    // closing the scanner object
    input.close();
  }
}
