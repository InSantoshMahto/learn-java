import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LeetCode {
  public static void main(String[] args) {
    LeetCode lc = new LeetCode();
    
    // https://leetcode.com/problems/two-sum/
    int[] arrayOfNumbersForTwoSum = { 2, 7, 11, 15 };
    int targetForTwoSum = 9;
    int[] resultForTwoSum = lc.twoSum(arrayOfNumbersForTwoSum, targetForTwoSum);
    System.out.println("Two Sum of:-");
    lc.printArray(resultForTwoSum);
    
    // https://leetcode.com/problems/two-sum/
    int[] arrayOfNumbersForThreeSum = {-1,0,1,2,-1,-4};
    List<List<Integer>> resultForThreeSum = lc.threeSum(arrayOfNumbersForThreeSum);
    System.out.println("Three Sum of:-");
    System.out.println(resultForThreeSum);
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


  private  List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results =  new ArrayList<List<Integer>>();
    if(nums.length < 3) return results;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length - 2; i++){
      for(int j = i + 1; j < nums.length - 1; j++ ) {
        for(int k = j + 1; k < nums.length; k++){
          if(nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> result = new ArrayList<Integer>();
            result.add(nums[i]);
            result.add(nums[j]);
            result.add(nums[k]);
            Collections.sort(result);
            if(!results.contains(result))
              results.add(result);
          }
        }
      }
    }
    return results;
  }

  private void printArray(int[] numbers) {
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
