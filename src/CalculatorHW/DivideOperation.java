package CalculatorHW;


public class DivideOperation implements Operator {

    @Override
    public double operate(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }
}
