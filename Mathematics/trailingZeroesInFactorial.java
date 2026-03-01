import java.util.Scanner;

public class trailingZeroesInFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();

        if (num < 0) {
            System.out.println("Cannot calculate for negative numbers.");
            return;
        }

        System.out.println("Trailing zeroes: " + countTrailingZeroes(num));
    }

    public static int countTrailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
