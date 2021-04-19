import java.util.*;

public class PlusOne {
    public static void main(String[] args){
        int[] numbers1 = {9,8,7,6,5,4,3,2,1,0};
        int[] numbersWithAPlusOne1 = plusOne(numbers1);
        System.out.println(Arrays.toString(numbersWithAPlusOne1));

    }

    private static int[] plusOne (int[] digits){
        StringBuilder stringBuilder = new StringBuilder();

        for (int value : digits) {
            stringBuilder.append(digits[value]).append(";");
        }
        String[] digitsToString = stringBuilder.toString().split(";");
        int x = Integer.parseInt(String.valueOf(digitsToString));
        x++;
        System.out.println(x);
        String temp = Integer.toString(x);
        System.out.println(temp);
        int[] result = new int[temp.length()];
        for (int index = 0; index < result.length; index++) {
//            result[index] = temp.charAt(index) - '0';
            result[index] = Character.getNumericValue(temp.charAt(index));
        }
        return result;
    }


}
