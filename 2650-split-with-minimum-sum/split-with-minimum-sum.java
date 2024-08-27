import java.util.Arrays;
class Solution {

    public static int splitNum(int num) {
        // Convert the number to a char array of digits
        char[] digits = String.valueOf(num).toCharArray();
        
        // Sort the digits to ensure smallest digits are placed first
        Arrays.sort(digits);

        // Two strings to form num1 and num2
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        // Distribute digits alternately to num1 and num2
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                num1.append(digits[i]);
            } else {
                num2.append(digits[i]);
            }
        }

        // Convert the strings back to integers
        int number1 = num1.length() > 0 ? Integer.parseInt(num1.toString()) : 0;
        int number2 = num2.length() > 0 ? Integer.parseInt(num2.toString()) : 0;

        // Return the sum of the two numbers
        return number1 + number2;
    }
}