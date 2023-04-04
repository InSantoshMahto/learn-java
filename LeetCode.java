import java.util.*;

public class LeetCode {
  public static void main(String[] args) {
    LeetCode lc = new LeetCode();

    // https://leetcode.com/problems/two-sum/
    int[] arrayOfNumbersForTwoSum = { 2, 7, 11, 15 };
    int targetForTwoSum = 9;
    int[] resultForTwoSum = lc.twoSum(arrayOfNumbersForTwoSum, targetForTwoSum);
    System.out.println("Two Sum:-");
    lc.printArray(resultForTwoSum);

    // https://leetcode.com/problems/3sum/
    int[] arrayOfNumbersForThreeSum = { -1, 0, 1, 2, -1, -4 };
    List<List<Integer>> resultForThreeSum = lc.threeSum(arrayOfNumbersForThreeSum);
    System.out.println("Three Sum:-");
    System.out.println(resultForThreeSum);
  }

  private int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
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

  private List<List<Integer>> threeSum(int[] numbers) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Arrays.sort(numbers);
    int size = numbers.length;
    for (int i = 0; i < size - 2; i++) {
      if (i == 0 || numbers[i] != numbers[i - 1]) {
        int left = i + 1, right = size - 1;
        while (left < right) {
          if (numbers[left] + numbers[right] == -1 * numbers[i]) {
            list.add(Arrays.asList(numbers[i], numbers[left], numbers[right]));
            while (left < right && numbers[left] == numbers[left + 1])
              left++;
            while (left < right && numbers[right] == numbers[right - 1])
              right--;
            left++;
            right--;
          } else if (numbers[left] + numbers[right] < -1 * numbers[i])
            left++;
          else
            right--;
        }
      }
    }
    return list;
  }

  public List<List<Integer>> threeSumPro(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
      if (i == 0 || nums[i - 1] != nums[i]) {
        twoSumPro(nums, i, res);
      }
    return res;
  }
  
  void twoSumPro(int[] nums, int i, List<List<Integer>> res) {
    Set<Integer> seen = new HashSet<Integer>();
    for (int j = i + 1; j < nums.length; ++j) {
      int complement = -nums[i] - nums[j];
      if (seen.contains(complement)) {
        res.add(Arrays.asList(nums[i], nums[j], complement));
        while (j + 1 < nums.length && nums[j] == nums[j + 1])
          ++j;
      }
      seen.add(nums[j]);
    }
  }

  private void printArray(int[] numbers) {
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
