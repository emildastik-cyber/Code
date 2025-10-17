import java.util.*;

public class calc {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number");

    int a = sc.nextInt();

    System.out.println("Enter the second number");

    int b = sc.nextInt();

    System.out.println("1- Multiplication\r\n" + //
                "2- Division\r\n" + //
                "3- Subtraction\r\n" + //
                "4- Addition");

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.print(a + " * " + b + " = " + (a*b));
                break;
            case 2:
                System.out.print(a + " / " + b + " = " + (a/b));
                break;
            case 3:
                System.out.print(a + " - " + b + " = " + (a - b));
                break;
            case 4:
                System.out.print(a + " + " + b + " = " + (a+b));
                break;
            default:
                System.out.print("Please enter a number between 1-4");
                break;
        }

    }
}
