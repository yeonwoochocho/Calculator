package week03.Java_문법_종합반_조연우;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int firstNumber = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int secondNumber = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요");
        String kiho = sc.nextLine();
        System.out.println("");
    }
}