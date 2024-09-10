package CalculatorHW;

public class AddOperation implements Operator {

    @Override
    public double operate (double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
}
