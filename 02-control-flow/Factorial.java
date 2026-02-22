import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Iterative Factorial");
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int res = 1;
        if (num<0) {
            System.out.println("Factorial of negative numbers can not be calculated");
        } else if(num==0){
            System.out.println("Factorial of 0 is "+ 1);
        }
        else{
            res = factorial(num);
            System.out.println("Factorial of "+num+" is "+res);
        }
        s.close();
    }

    public static int factorial(int n){
        int res = 1;
        for(int i =2; i<=n; i++){
            res = res*i;
        }
        return res;
    }
}
