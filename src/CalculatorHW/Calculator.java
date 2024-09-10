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




}

