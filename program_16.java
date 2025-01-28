import java.util.*;
public class program_16{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int number =adi.nextInt();

        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number/= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number/= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length- 1-i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        boolean hasZero = false;
        while (number > 0) {
            if (number % 10 == 0) {
                hasZero = true;
            }
            if (hasZero && number / 10 > 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
