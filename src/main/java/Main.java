import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Calculator calculator = new Calculator();
        String command;
        int number1, number2=0, output;
        System.out.println("Welcome to the calculator.\nEnter a command:");
        Scanner input = new Scanner(System.in);
        command = input.next().substring(0);
        number1 = input.nextInt();
        if (input.hasNextInt()) {
            number2 = input.nextInt();
        }
        switch (command) {
            case "add":
                output = calculator.add(number1,number2);
                System.out.println(output);
                break;
            case "subtract":
                output = calculator.subtract(number1,number2);
                System.out.println(output);
                break;
            case "multiply":
                output = calculator.multiply(number1,number2);
                System.out.println(output);
                break;
            case "divide":
                output = calculator.divide(number1,number2);
                System.out.println(output);
                break;
            case "fibonacci":
                output = calculator.fibonacciNumberFinder(number1);
                System.out.println(output);
                break;
            case "binary":
                output =Integer.parseInt(calculator.intToBinaryNumber(number1));
                System.out.println(output);
                break;
        }

    }
}
