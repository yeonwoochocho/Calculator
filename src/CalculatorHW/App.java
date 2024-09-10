//package CalculatorHW;
////Lv 1. 수행
////import CalculatorHW.AddOperation;
////import CalculatorHW.Calculator;
////import CalculatorHW.DivideOperation;
////import CalculatorHW.MultiplyOperation;
////import CalculatorHW.SubstractOperation;
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 숫자를 입력하세요");
//        int firstNumber = sc.nextInt();
//        System.out.println("두번째 숫자를 입력하세요");
//        int secondNumber = sc.nextInt();
//        System.out.println("사칙연산 기호를 입력하세요");
//        String operator = sc.next();
//        double result = 0;
//
//
//        if (operator.equals("+")) {
//            result = firstNumber + secondNumber;
//
//        } else if (operator.equals("*")) {
//            result = firstNumber * secondNumber;
//
//        } else if (operator.equals("-")) {
//            result = firstNumber - secondNumber;
//
//        } else if (operator.equals("/")) {
////            if(secondNumber == 0){
////                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
////            }
//            result = firstNumber / secondNumber;
//        }
//        System.out.println("결과: " + result);
//        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//
//        while(true) {
//            String exit = sc.nextLine();
//
//            if (exit.equals("exit")) {
//                break;
//            }
//        }
//
//
//    }
//}