import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Double> resultsQueue = new LinkedList<>();
        boolean running = true;

        while (running) {
            try {
                // Input for the first number
                System.out.print("첫번째 숫자를 입력하세요: ");
                double firstNumber = scanner.nextDouble();

                // Input for the second number
                System.out.print("두번째 숫자를 입력하세요: ");
                double secondNumber = scanner.nextDouble();

                // Input for the operator
                System.out.print("연산자를 입력하세요 (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                // Determine the operator type
                OperatorType operatorType = OperatorType.fromChar(operator);

                // Create an ArithmeticCalculator object
                ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>(firstNumber, secondNumber, operatorType);

                // Perform calculation and display result
                double result = calculator.calculate();
                System.out.printf("계산 결과 %.2f %c %.2f = %.2f%n", firstNumber, operator, secondNumber, result);

                // Store the result in the queue
                resultsQueue.add(result);

                // Ask if user wants to exit
                System.out.print("연산을 종료하시겠습니까? (exit 입력 시 종료) ");
                scanner.nextLine(); // Consume newline
                String exitCommand = scanner.nextLine();

                if (exitCommand.equalsIgnoreCase("exit")) {
                    running = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다. 숫자를 입력해주세요");
                scanner.nextLine(); // Clear the invalid input
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Display the maximum result from the queue
        if (!resultsQueue.isEmpty()) {
            double maxResult = resultsQueue.stream().mapToDouble(v -> v).max().orElse(Double.NaN);
            System.out.printf("가장 큰 결과값: %.2f%n", maxResult);
        } else {
            System.out.println("결과가 없습니다.");
        }

        scanner.close();
    }
}
