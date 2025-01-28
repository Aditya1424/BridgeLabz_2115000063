import java.util.*;
public class program_14{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = adi.nextInt();

        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second smallest: " + smallestTwo[1]);
    }
    
    public static int countDigits(int number) {
        int count= 0;
        while (number>0) {
            count++;
            number/= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count-1; i>= 0;i--) {
            digits[i] = number%10;
            number/= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        boolean hasZero =false;
        while (number > 0) {
            if (number%10 == 0) {
                hasZero =true;
            }
            if (hasZero&& number/10 > 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit: digits) {
            sum += Math.pow(digit, digits.length);
        }
        return (sum ==number);
    }

    public static int[] findLargestTwo(int digits[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit: digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
            else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit: digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } 
            else if (digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}