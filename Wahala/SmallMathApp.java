public class SmallMathApp {
    double firstNumber = 30;
    double secondNumber = 10;

    public double calculateExpression(char operation) {
        switch (operation) {
            case '+': return add(firstNumber, secondNumber);
            case '-': return subtract(firstNumber, secondNumber);
            case '/': return divide(firstNumber, secondNumber);
            case '*': return multiply(firstNumber, secondNumber);
            default: throw new IllegalArgumentException("Invalid operation!!!");
        }
    }

    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0)
            throw new ArithmeticException("Cannot divide by zero!!!");

        return (double) numberOne / numberTwo;
    }
}