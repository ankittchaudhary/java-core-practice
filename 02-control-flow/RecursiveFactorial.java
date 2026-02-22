import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Recursive Factorial");
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int res = 1;
        if (num<0) {
            System.out.println("Factorial of negative numbers can not be calculated");
        } else if(num==0){
            System.out.println("Factorial of 0 is "+ 1);
        }
        else{
            res = recursivefactorial(num);
            System.out.println("Factorial of "+num+" is "+res);
        }
        s.close();
    }

    public static int recursivefactorial(int n){
        if (n==0){
            return 1;
        }
        return n*recursivefactorial(n-1);
    }
}
