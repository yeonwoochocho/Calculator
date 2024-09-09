package CalculatorHW;

import CalculatorHW.AbstractOperation;

public class Calculator {

    private CalculatorHW.AbstractOperation operation;

    public Calculator(AddOperation operation) {
        this.operation = operation;

    }
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;

    }
    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}