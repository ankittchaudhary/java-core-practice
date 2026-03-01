import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        System.out.println("GCD or HCF of two Numbers");
        /*
        input: 4, 6
        output: 2

        4 = 2*2*1
        6 = 3*2*1

        common divisor 1, 2
        largest = 2 so gcd or hcf =2
        hcf = 2

        ---------------
        i/p: 7, 13
        o/p: no common divisor apart from 1 so 1

         */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();

        int res = calculateGCD(a, b);
        System.out.printf("GCD of %d and %d is %d", a,b,res);

    }
    public static int calculateGCD(int a, int b){
        int res = Min(a,b);
        while (res>0){
            if (a%res==0 && b%res==0){
                break;
            }
            res --;
        }
        return res;
    }

    public static int Min(int a, int b){
        int min =a;
        if (b<min){
            min=b;
        }
        return min;
    }
}
