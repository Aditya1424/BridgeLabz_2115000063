import java.util.*;
public class program_15{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int number= adi.nextInt();

        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        
        for (int[] pair: frequency) {
            System.out.println("Digit: " + pair[0] + ", Frequency: " + pair[1]);
        }
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum =0;
        for (int digit: digits) {
            sum +=digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum =0;
        for (int digit: digits) {
            sum+= (int)Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return (number % sum ==0);
    }

    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        while (number > 0) {
            freq[number % 10]++;
            number /= 10;
        }
        int nonZeroCount = 0;
        for (int f : freq) {
            if (f > 0) {
                nonZeroCount++;
            }
        }
        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0;i<freq.length;i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }
}
