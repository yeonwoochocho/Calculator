package CalculatorHW;

import CalculatorHW.AbstractOperation;

public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
