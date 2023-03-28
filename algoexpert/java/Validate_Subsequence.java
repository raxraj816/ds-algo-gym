import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int seqIndex = 0;
    int arrIndex = 0;
    while(arrIndex < array.size() && seqIndex < sequence.size()){
      if(array.get(arrIndex).equals(sequence.get(seqIndex))) {
        seqIndex++;
      }
      arrIndex++;
    }
    return seqIndex == sequence.size();
  }
}