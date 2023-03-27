import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> hashSet = new HashSet<>();
    int[] result = {0, 0};
    for (int num : array) {
      int complement = targetSum - num;
      if (hashSet.contains(complement)) {
        result[0] = complement;
        result[1] = num;
        return result;
      }
      hashSet.add(num);
    }
    return new int[0];
  }
}