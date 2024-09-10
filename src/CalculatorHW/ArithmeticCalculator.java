package CalculatorHW;

import java.util.*;

@NoArgsConstructor
public class ArithmeticCalculator<T extends Number> extends Calculator {

    private T firstNumber;
    private T secondNumber;
    private char operator;

    //필드값 주입
    public void toArithmeticCalculator(T firstInput, T secondInput, char operatorInput){
        this.firstNumber = firstInput;
        this.secondNumber = secondInput;
        this.operator = operatorInput;
    }




}