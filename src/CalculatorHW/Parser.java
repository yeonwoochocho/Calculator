package CalculatorHW;

import CalculatorHW.AddOperation;
import CalculatorHW.Calculator;
import CalculatorHW.DivideOperation;
import CalculatorHW.MultiplyOperation;
import CalculatorHW.SubstractOperation;
import CalculatorHW.*;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";  // 감증할 형태, 벗어나면 오류 발생
    private static final String NUMBER_REG = "^[0-9]*$";

    private final CalculatorHW.Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{ //throws Exception 예외처리
        //정규식 체크
        if (!Pattern.matches(NUMBER_REG, firstInput)) { //matches(정규식, 체크할 대상)
            throw new BadInputException("정수값"); //BadInput 예외메시지 출력
        }

        //구현 - instance에 대한 설정 바꿈
        this.calculator.setFirstNumber(Integer.parseInt(firstInput)); //int 형으로 바꿔줌

        return this; //parser 내보냄
    }

    public Parser parseSecondNum(String secondInput) throws Exception {
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception {
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙 연산의 연산자"); //체크 못했으면 예외 발생 -> 오류메시지 출력
        }

        switch (operationInput) {
            case "+" -> this.calculator.setOperation(new AddOperation());
            case "-" -> this.calculator.setOperation(new SubstractOperation());
            case "*" -> this.calculator.setOperation(new MultiplyOperation());
            case "/" -> this.calculator.setOperation(new DivideOperation());
        }

        return this; //변경한 operation 리턴
    }

    public double executeCalculator() {
        return calculator.calculate();
    }

}

