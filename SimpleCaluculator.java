import java.util.Scanner;
public class SimpleCaluculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation (+, -, *, /):");
        char operation = sc.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = num1+num2;
                System.out.println("The result is: " + result);
                break;
            case'-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;  
            default:
                System.out.println("Error: Invalid operation.");
                
        }
        sc.close();
    }

}