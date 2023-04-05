package practice;

public class Day24 {
  public static void main(String[] args) {
    System.out.println("Day24");

    int n = 10;
    System.out.print(n + " to 1 recursively:- ");
    printNto1(n);
    System.out.println();

    System.out.print("1 to " + n + " recursively:- ");
    print1toN(n);
    System.out.println();

    int fact = factorial(n);
    System.out.println("Factorial of " + n + " recursively:- " + fact);

    int fib = fibonacci(3);
    System.out.println("Fibonacci of " + n + " recursively:- " + fib);

    System.out.println("madam is Palindrome:- " + isPalindrome("madam"));
  }

  public static void printNto1(int A) {
    System.out.print(A + " ");
    if (A > 1)
      printNto1(A - 1);
    else
      System.out.println("");
  }

  public static void print1toN(int A) {
    if (A > 0) {
      print1toN(A - 1);
      System.out.print(A + " ");
    }
  }

  public static int factorial(int A) {
    return A == 1 ? A : A * factorial(A - 1);
  }

  public static int fibonacci(int A) {
    return A == 0 || A == 1 ? A : fibonacci(A - 1) + fibonacci(A - 2);
  }

  public static boolean isPalindrome(String str, int left, int right) {
    if (left >= right)
      return true;
    return str.charAt(left) == str.charAt(right) && isPalindrome(str, left + 1, right - 1);
  }

  public static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;
    if (left >= right)
      return true;
    return str.charAt(left) == str.charAt(right) && isPalindrome(str, left + 1, right - 1);
  }
}