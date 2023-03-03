import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String command;
        int number1, number2=0, output;
        System.out.println("Welcome to the calculator.\nEnter a command:");
        Scanner input = new Scanner(System.in);
        String check = input.next();
        while (!check.equals("stop")) {
            command = check;
            number1 = input.nextInt();
//            if (input.hasNext()) {
//                number2 = input.nextInt();
//            }
            switch (command) {
                case "add":
                    number2 = input.nextInt();
                    output = calculator.add(number1,number2);
                    System.out.println(output);
                    break;
                case "subtract":
                    number2 = input.nextInt();
                    output = calculator.subtract(number1,number2);
                    System.out.println(output);
                    break;
                case "multiply":
                    number2 = input.nextInt();
                    output = calculator.multiply(number1,number2);
                    System.out.println(output);
                    break;
                case "divide":
                    number2 = input.nextInt();
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
            check = input.next();
        }
    }
}
