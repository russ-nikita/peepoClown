import java.util.*;

public class ArraySingleNumber {

        public static int singleNumber(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int eachElementInNums : nums) {
                hashMap.put(eachElementInNums, hashMap.getOrDefault(eachElementInNums, 0) + 1);
            }
            for (int i : nums) {
                if (hashMap.get(i) == 1) {
                    return i;
                }
            }
            return 0;
        }

    public static void main(String[] args) {
//        Given a non-empty array of integers nums, every element appears twice except for one
        int[] nums = {40, 40, 8, 113, 113};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int theNumberWeWereLookingFor = singleNumber(nums);
        System.out.println(theNumberWeWereLookingFor);
    }
}
