package practice;

public class Day24 {
  public static void main(String[] args) {
    System.out.println("Day24");

    int n = 10;
    System.out.print(n + " to 1 recursively:- ");
    printAto1(n);
  }

  public static void printAto1(int A) {
    System.out.print(A + " ");
    if (A > 1)
      printAto1(A - 1);
    else
      System.out.println("");
  }
}
