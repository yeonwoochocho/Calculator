public enum OperatorType {
    OPERATOR_ADD('+') {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    OPERATOR_SUBTRACT('-') {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    OPERATOR_MULTIPLY('*') {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    OPERATOR_DIVIDE('/') {
        @Override
        public double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    };

    private final char operatorName;

    OperatorType(char operatorName) {
        this.operatorName = operatorName;
    }

    public char getOperatorName() {
        return operatorName;
    }

    public static OperatorType fromChar(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.operatorName == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }

    public abstract double apply(double a, double b);
}
