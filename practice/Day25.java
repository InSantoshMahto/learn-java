package practice;

public class Day25 {
  public static void main(String[] args) {
    System.out.println("Day25");
    System.out.println("2^3 % 3 = " + pow(2, 3, 3));
  }

  public static long pow(long A, long B, long C) {
    if (A == 0)
      return 0;
    if (B == 0)
      return 1;

    long half = pow(A, B / 2, C);
    if (B % 2 == 0) {
      long mul = half * half;
      long mod = mul % C;
      return mod < 0 ? mul + C : mod;
    } else {
      long firstMul = A * half;
      long firstMod = firstMul % C;
      firstMod = firstMod < 0 ? firstMul + C : firstMod;
      long secondMul = firstMod * half;
      long secondMod = secondMul % C;
      return secondMod < 0 ? secondMul + C : secondMod;
    }
  }
}