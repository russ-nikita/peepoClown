import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Input an asc sorted array with duplicates
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {1, 1}; //Check 2 elements array with equals
//        int[] nums = {0, 1}; //Check 2 elements array with non-equals
//        int[] nums = {100}; //One element checker
        System.out.println("nums = " + Arrays.toString(nums));
        removeDuplicates(nums);
    }

    public static void removeDuplicates(int[] data) {
        if (data.length == 1) {
            System.out.println(data.length + ", nums = " + Arrays.toString(data));
        }
        else if (data.length == 2) {
                if (data[0] == data[1]) {
                    int[] newData = new int[1];
                    newData[0] = data[0];
                    System.out.println(newData.length + ", nums = " + Arrays.toString(newData));
                }
                else System.out.println(data.length + ", nums = " + Arrays.toString(data));
        }
        else {
            StringBuilder S = new StringBuilder();
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] != data[i+1]) {
                    S.append(data[i]).append(" "); //Constructing a String with a different numbers from array
                }
            }
            S.append(data[data.length - 1]).append(" "); //Add last element
//            System.out.println(S); // Uncomment this to see a "buffer" string in console
            String[] strArray = S.toString().split(" ");
            int[] newData = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                newData[i] = Integer.parseInt(strArray[i]);
            }
            System.out.println(newData.length + ", nums = " + Arrays.toString(newData));
        }
    }
}
