public class ArithmeticCalculator<T extends Number> {
    private final T firstNumber;
    private final T secondNumber;
    private final OperatorType operatorType;

    public ArithmeticCalculator(T firstNumber, T secondNumber, OperatorType operatorType) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operatorType = operatorType;
    }

    public double calculate() {
        double a = firstNumber.doubleValue();
        double b = secondNumber.doubleValue();
        return operatorType.apply(a, b);
    }
    private double convertToDouble(Object number) {
        if (number instanceof Number) {
            return ((Number) number).doubleValue();
        }
        throw new IllegalArgumentException("유효하지 않은 숫자 타입");
    }
}
