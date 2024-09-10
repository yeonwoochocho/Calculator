package CalculatorHW;

import java.util.Arrays;
import java.util.function.BiFunction;


public enum OperatorType {
    OPERATOR_ADD('+'),
    OPERATOR_SUBSTRACT('-'),
    OPERATOR_MULTIPLY('*'),
    OPERATOR_DIVIDE('/');


    private final char operatorName;

    OperatorType(char c) {
        this.operatorName = c;
    }

}
