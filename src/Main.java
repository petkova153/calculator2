import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc;
        Integer num1;
        Integer num2;
        char operator;

        System.out.println("Enter first number:");
        sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Please choose operator +,-,/,*");
        operator = sc.next().charAt(0);

        System.out.println("you chose " + operator);
        switch (operator) {
            case '+':
                System.out.println("The result is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The result is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The result is: " + (num1 / num2));
                break;
        }
    }
}