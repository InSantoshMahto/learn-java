package practice;

public class Day7 {
  public static void main(String[] args) {
    System.out.println("Day7");
    Day7 d = new Day7();
    int myCount = d.noOfElements(new int[] { 5, 5, 3 });
    System.out.println("My count is:- " + myCount);
    int myPair = d.pair(new int[] { 1, 2, 3, 4 }, 7);
    System.out.println("My Pair:- " + myPair);
    int[] myReverse = d.reverse(new int[] { 1, 2, 3, 4 }, 2, 3);
    System.out.println("My Reverse:- ");
    for (int i = 0; i < myReverse.length; i++) {
      System.out.print(myReverse[i]);
    }
    System.out.print("\n");
    int[] myRotate = d.rotate(new int[] { 1, 2, 3, 4 }, 2);
    System.out.println("My rotate:- ");
    for (int i = 0; i < myRotate.length; i++) {
      System.out.print(myRotate[i]);
    }
    System.out.print("\n");
  }

  private int noOfElements(int[] A) {
    int maxNum = 1;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > maxNum) {
        maxNum = A[i];
      }
    }
    int occurs = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == maxNum) {
        occurs++;
      }
    }
    return A.length - occurs;
  }

  private int pair(int[] A, int B) {
    for (int i = 0; i < A.length - 1; i++) {
      for (int j = i + 1; j < A.length; j++) {
        if (A[i] + A[j] == B) {
          return 1;
        }
      }
    }
    return 0;
  }

  private int[] reverse(int[] A, int B, int C) {
    while (B < C) {
      int temp = A[B];
      A[B] = A[C];
      A[C] = temp;
      B++;
      C--;
    }
    return A;
  }

  private int[] rotate(int[] A, int B) {
    for (int i = 0; i < B; i++) {
      int temp = A[A.length - 1];
      for (int j = A.length - 1; j > 0; j--) {
        A[j] = A[j - 1];
      }
      A[0] = temp;
    }
    return A;
  }
}
