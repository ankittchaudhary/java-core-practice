import java.util.Scanner;

public class Greet {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = s.next();
        System.out.println("Hey "+ name+"!");

    }
}
