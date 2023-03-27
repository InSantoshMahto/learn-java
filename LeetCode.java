import java.util.HashMap;

public class LeetCode {
  public static void main(String[] args) {
    LeetCode lc = new LeetCode();
    // int[] arrayOfNumbers = { 2, 3, 4, 5, 4 };
    int[] arrayOfNumbers = { 2, 7, 11, 15 };
    int[] result = lc.twoSum(arrayOfNumbers, 9);
    System.out.println("Two Sum of:-");
    lc.printArray(result);
  }

  private int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      int diff = target - number;
      if (map.containsKey(diff)) {
        result[0] = i;
        result[1] = map.get(diff);
        return result;
      }
      map.put(number, i);
    }
    return result;
  }

  private void printArray(int[] numbers) {
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
