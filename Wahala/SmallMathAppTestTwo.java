import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallMathAppTestTwo {

    SmallMathAppTwo mathApp;

    @BeforeEach
    void setUp() {
        mathApp = new SmallMathAppTwo();
    }

    @Test
    public void testThatIMultiplyTwoNumbersAndItGivesTheMultiplicationOfBothNumbers() {
        double numberOne = 3;
        double numberTwo = 10;

        double actualResult = mathApp.multiply(numberOne, numberTwo);
        double expectedResult = 30;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testThatISubtractTwoNumbersAndItGivesTheDifferenceOfBothNumbers() {
        double numberOne = 30;
        double numberTwo = 10;

        double actualResult = mathApp.subtract(numberOne, numberTwo);
        double expectedResult = 20;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testThatIAddTwoNumbersAndItGivesTheSumOfBothNumbers() {
        double numberOne = 30;
        double numberTwo = 10;

        double actualResult = mathApp.add(numberOne, numberTwo);
        double expectedResult = 40;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testThatIDivideTwoNumbersAndItGivesTheDivisionOfBothNumbers() {
        double numberOne = 30;
        double numberTwo = 10;

        double actualResult = mathApp.divide(numberOne, numberTwo);
        double expectedResult = 3;

        assertEquals(expectedResult, actualResult);

        assertEquals(2.5, mathApp.divide(5, 2));
    }

    @Test
    public void testThatIDivideANumberByZeroItThrowsAnException() {
        assertThrows(ArithmeticException.class, () -> mathApp.divide(5, 0));
    }

    @Test
    public void testThatIChooseAnOperationWithTwoNumbersAndItGivesTheCorrectResultBasedOnThatOperation() {
        double firstNumber = 50;
        double secondNumber = 20;

        mathApp.setFirstNumber(firstNumber);
        mathApp.setSecondNumber(secondNumber);

        char addition = '+';
        double actualAdditionResult = mathApp.calculateExpression(addition);
        double expectedAdditionResult = 70;
        assertEquals(actualAdditionResult, expectedAdditionResult);

        char subtraction = '-';
        double actualSubtractionResult = mathApp.calculateExpression(subtraction);
        double expectedSubtractionResult = 30;
        assertEquals(actualSubtractionResult, expectedSubtractionResult);

        char division = '/';
        double actualDivisionResult = mathApp.calculateExpression(division);
        double expectedDivisionResult = 2.5;
        assertEquals(actualDivisionResult, expectedDivisionResult);

        char multiplication = '*';
        double actualMultiplicationResult = mathApp.calculateExpression(multiplication);
        double expectedMultiplicationResult = 1000;
        assertEquals(actualMultiplicationResult, expectedMultiplicationResult);
    }

    @Test
    public void testThatIGiveAWrongOperationItThrowsAnException() {
        assertThrows(IllegalArgumentException.class, () -> mathApp.calculateExpression('&'));
    }
}