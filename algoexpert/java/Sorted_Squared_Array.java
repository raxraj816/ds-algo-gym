import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    int n = array.length, left = 0, right = n - 1;
     
    int result[] = new int[n];
     
    for(int index = n - 1; index >= 0; index--)
    {
        if (Math.abs(array[left]) > array[right])
        {
            result[index] = array[left] * array[left];
            left++;
        }
        else
        {
            result[index] = array[right] * array[right];
            right--;
        }
    }
    return result;
  }
}