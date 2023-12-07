public class Calculator {

    int executeOperation(int a, int b, MathematicalOperation mathematicalOperation) {
        return mathematicalOperation.calculate(a, b);
    }
}
