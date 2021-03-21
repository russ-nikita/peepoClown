import java.util.Arrays;

public class ArrayRemoveDuplicates {

    private static final String SEPARATOR = ",";

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 2, 2, 3, 3, 4}; // Input an ASC sorted(!) array with duplicates
        System.out.println("Old array = " + Arrays.toString(array));
        int[] arrayWithOutDuplicates = removeDuplicates(array);
        System.out.println("New array = " + Arrays.toString(arrayWithOutDuplicates));
    }

    public static int[] removeDuplicates(int[] data) {
        if (data != null && data.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int index = 0; index < data.length - 1; index++) {
                if (data[index] != data[index + 1]) {
                    stringBuilder.append(data[index]).append(SEPARATOR);
                }
            }
            stringBuilder.append(data[data.length - 1]); //Add last element
            String[] strArray = stringBuilder.toString().split(SEPARATOR);
            int[] newData = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                newData[i] = Integer.parseInt(strArray[i]);
            }
            return newData;
        }
        return null;
    }
}
