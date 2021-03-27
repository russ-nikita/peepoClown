import java.util.Arrays;
import java.util.Scanner;

public class Rotator {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        rotate(nums, input());
    }

    public static int input() {
        System.out.println("How many turns will we do, mate?");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.next());
    }

    public static void rotate(int[] nums, int k) {
        if (nums != null && nums.length > 0) {
            int totalTurns = k;
            while (k > 0) {
                for (int index = nums.length - 1; index > 0; index--) {
                    int buffer;
                    buffer = nums[index - 1];
                    nums[index - 1] = nums[index];
                    nums[index] = buffer;
                }
                k--;
            }
            System.out.println("Turns: " + totalTurns + "; Array = " + Arrays.toString(nums));
        } else System.out.println("Dude! Your array is not valid!");
    }

}
