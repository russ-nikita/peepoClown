import java.util.Arrays;

public class ArrayDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 1; ++index) {
            if (nums[index] == nums[index + 1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(containsDuplicate(nums));
    }
}
