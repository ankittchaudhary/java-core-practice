import java.util.Scanner;

public class RecursiveFactorial {
    static void main(String[] args) {
        System.out.println("Recursive Factorial");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        if (num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long res = calculateRecursiveFactorial(num);
            System.out.println("Factorial of "+ num+" is "+res);
        }
    }

    static long calculateRecursiveFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*calculateRecursiveFactorial(n-1);
    }
}

/*
Time Complexity
the function calls itself: fact(n) -> fact(n-1) -> fact(n-2) ...
perform n multiplications.
O(n)

Space Complexity
Every time a function calls itself, Java pushes a Stack Frame onto the Call Stack. This frame stores the local variables and the return address
O(n)
 */

//Iterative approach is better
//as Time complexity is same but space complexity is O(i)
