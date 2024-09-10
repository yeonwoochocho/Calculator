package CalculatorHW;

import  CalculatorHW.CalculatorApp;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("첫 번째 숫자를 입력하세요:");
//        int firstNumber = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요:");
//        int secondNumber = sc.nextInt();
//
//        System.out.print("사칙연산 기호를 입력하세요: ");
//        String operator = sc.next();
//
//
//        double result = calculator.calculate(firstNumber, secondNumber);
//
//        if (operator.equals("+")) {
//            System.out.println("연산 결과: " + calculator.calculate(firstNumber, secondNumber));
//        } else if (operator.equals("-")) {
//            calculator.setOperation(new SubstractOperation());
//            System.out.println("연산 결과: " + calculator.calculate(firstNumber, secondNumber));
//        } else if (operator.equals("*")) {
//            calculator.setOperation(new MultiplyOperation());
//            System.out.println("연산 결과: " + calculator.calculate(firstNumber, secondNumber));
//        } else if (operator.equals("/")) {
//            if (secondNumber == 0) {
//                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//            }
//            calculator.setOperation(new DivideOperation());
//            System.out.println("연산 결과: " + calculator.calculate(firstNumber, secondNumber));
//        }
//        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//
//        while (true) {
//            String exit = sc.nextLine();
//
//            if (exit.equals("exit")) {
//                break;
//            }
//
//
//        }
//        System.out.println("계산기가 종료되었습니다.");
//
//
//        //삭제 여부 입력
//        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//        try {
//            String removeInput = sc.nextLine().trim(); //trim() 입력 받은 글자의 공백을 없애줌
//            if (removeInput.equals("remove")) {
//                calculator.removeResult();
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage()); //예외 메시지 종류 출력
//        }
//
//
//    }
//}
