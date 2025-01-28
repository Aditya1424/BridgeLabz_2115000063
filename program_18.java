import java.util.*;
public class program_18{
    public static void main(String[] args) {
        Scanner adi=new Scanner(System.in);
        int num =adi.nextInt();

        int factors[]= findFactors(num);

        System.out.println("Factors of " + num + ": ");
        for(int factor: factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest factor: " + findGreatestFactor(num, factors));
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        System.out.println("Product of factors: " + findProductOfFactors(factors));
        System.out.println("Product of cube of factors: " + findProductOfCubeOfFactors(factors));

        System.out.println(num + " is perfect number: " + isPerfectNumber(num));
        System.out.println(num + " is abundant number: " + isAbundantNumber(num));
        System.out.println(num + " is deficient number: " + isDeficientNumber(num));
        System.out.println(num + " is strong number: " + isStrongNumber(num));
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int num, int[] factors) {
        return factors[factors.length - 1];
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = findSumOfFactors(factors) - num;
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum= findSumOfFactors(factors)-num;
        return sum>num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors= findFactors(num);
        int sum = findSumOfFactors(factors) - num;
        return sum <num;
    }

    public static boolean isStrongNumber(int num) {
        int originalNum=num;
        int sum = 0;
        while (num >0) {
            int digit= num % 10;
            sum+= factorial(digit);
            num/= 10;
        }
        return sum ==originalNum;
    }

    public static int factorial(int n) {
        int result=1;
        for (int i=1; i<=n;i++) {
            result*=i;
        }
        return result;
    }
}
