package CalculatorHW;



public class SubstractOperation implements Operator {

    @Override
    public double operate(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }
}
