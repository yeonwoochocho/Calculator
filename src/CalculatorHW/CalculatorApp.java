package CalculatorHW;

import CalculatorHW.Parser;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception{
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
            }
            else {
                CalculatorApp.start();
            }
        }
        System.out.println("계산기가 종료되었습니다.");


        //삭제 여부 입력
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        try {
            String removeInput = sc.nextLine().trim(); //trim() 입력 받은 글자의 공백을 없애줌
            if (removeInput.equals("remove")) {
                calculator.removeResult();
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage()); //예외 메시지 종류 출력
        }

        return true;

    }


}
