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
      long mult = half * half;
      long mod = mult % C;
      return mod < 0 ? mult + C : mod;
    } else {
      long firstMult = A * half;
      long firstMod = firstMult % C;
      firstMod = firstMod < 0 ? firstMult + C : firstMod;
      long secondMult = firstMod * half;
      long secondMod = secondMult % C;
      return secondMod < 0 ? secondMult + C : secondMod;
    }
  }
}