package CalculatorHW;

import CalculatorHW.Parser;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception {
        Parser parser = new Parser();
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = sc.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("연산자를 입력해주세요!");
        String operator = sc.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = sc.nextLine();
        parser.parseSecondNum(secondInput);


        System.out.println("연산 결과 : " + parser.executeCalculator());
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        while (true) {
            String exit = sc.nextLine();

            if (exit.equals("exit")) {
                break;
            } else {
                CalculatorApp.start();
            }
        }
        Queue<Double> resultsQueue = new LinkedList<>();
        resultsQueue.add(parser.executeCalculator());
        if (!resultsQueue.isEmpty()) {
            double maxResult = resultsQueue.stream().mapToDouble(v -> v).max().orElse(Double.NaN);
            System.out.printf("가장 큰 결과값: %.2f%n", maxResult);
        } else {
            System.out.println("결과가 없습니다.");
        }
        System.out.println("계산기가 종료되었습니다.");


    }
}
