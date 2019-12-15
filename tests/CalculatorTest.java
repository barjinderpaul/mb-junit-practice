import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void basicAddition() {
        int basicCase = calculator.sum(1, 2);
        assertEquals(3,basicCase);
    }

    @Test
    public void negativeAddition() {
        int negativeAddition = calculator.sum(-1,-2);
        assertEquals(-3,negativeAddition);
    }

    @Test
    public void basicDifference() {
        int basicCase = calculator.difference(2,5);
        assertEquals(3,basicCase);
    }

    @Test
    public void negativeDifference() {
        int negDifference = calculator.difference(-4,-5);
        assertEquals(0,negDifference);
    }

    @Test
    public void basicMultiply() {
        int basicCase = calculator.multiply(2,5);
        assertEquals(10,basicCase);
    }

    @Test
    public void zeroMultiply() {
        int zeroMultiply = calculator.multiply(0,123);
        assertEquals(0,zeroMultiply);
    }

    @Teste
    public void basicDivide() {
        int basicCase = calculator.divide(12,4);
        assertEquals(3,basicCase);
    }

    @Test
    public void divdeByZero() {
        int divByZero = calculator.divide(15,0);
        assertEquals(-1,divByZero);
    }
}