package CalculatorHW;

import java.util.*;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private CalculatorHW.AbstractOperation operation;
    private Double result;

    public Calculator() {
        this.operation = operation;

    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation; //Setter 메소드

    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

    //저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드
    public void removeResult() {
        Queue<Double> resultQueue = new LinkedList<Double>(); //Collection 생성
        resultQueue.add(result);
        System.out.print(resultQueue.poll());//result 출력
        System.out.print("-> 남은 연산 결과가 없습니다.");
    }

}