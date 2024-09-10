package CalculatorHW;



public class MultiplyOperation implements Operator {

    @Override
    public double operate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
