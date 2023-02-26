package practice;

public class Day4 {
  public static void main(String[] args) {
    Day4 d = new Day4();
    long myNum = 328967962;
    boolean isPrime = d.isPrime(myNum) != 0;
    System.out.println(myNum + " is prime:- " + (isPrime ? "Yes" : "No"));
    int myCount = d.countFactor(10);
    System.out.println("My Count Factor is:- " + myCount);
    int mySqrt = d.sqrt(4);
    System.out.println("My sqrt is:- " + mySqrt);
  }

  public int isPrime(long A) {
    if (A == 1) {
      return 0;
    }
    if (A == 2 || A == 3) {
      return 1;
    }
    if (A % 2 == 0 || A % 3 == 0) {
      return 0;
    }
    for (int i = 5; i <= Math.sqrt(A); i += 6) {
      if (A % i == 0 || A % (i + 2) == 0) {
        return 0;
      }
    }
    return 1;
  }

  public int countFactor(int A) {
    int count = 2;
    for (int i = 2; i <= (A / 2); i++) {
      if (A % i == 0) {
        count++;
      }
    }
    return count;
  }

  public int sqrt(int A) {
    double sqrt = Math.sqrt(A);
    if ((sqrt % 1) == 0) {
      return (int) sqrt;
    } else {
      return -1;
    }
  }
}
