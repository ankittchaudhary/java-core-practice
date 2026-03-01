import java.util.Scanner;

public class IterativeFactorial {
    public static void main(String[] args) {
        System.out.println("Iterative Factorial");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        long res;
        if (num<0){
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            res = calculateFactorial(num);
            System.out.println("Factorial of "+num+" is "+res);
        }
        s.close();
    }
    public static long calculateFactorial(int n){
        long fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

}

//Iterative Factorial is better than the Recursive one
//due to space complexity it having O(i) and recursive having O(n) due to function calling itself leading stack to fill n times