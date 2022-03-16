package co.com.sofka.app.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sumar() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;
        
        // Act
        Long result = basicCalculator.sumar(number1, number2);
        
        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sumar(first, second),
                    () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing subtract: 1-1=0")
    public void restar() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;
        
        // Act
        Long result = basicCalculator.restar(number1, number2);
        
        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtracts")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "1,    2,   -1",
            "100,  51,  49",
            "100,  1,   99"
    })
    public void severalSubtracts(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.restar(first, second),
                    () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divide: 10/2=5")
    public void dividir() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;
        Long expectedValue = 5L;
        
        // Act
        Long result = basicCalculator.dividir(number1, number2);
        
        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "15,    3,   5",
            "20,    2,   10",
            "100,  1,  100",
            "100,  5,   20"
    })
    public void severalDivisions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.dividir(first, second),
                    () -> first + " / " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiply: 10/2=5")
    public void multiplicar() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;
        Long expectedValue = 20L;
        
        // Act
        Long result = basicCalculator.multiplicar(number1, number2);
        
        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "15,    3,   45",
            "20,    2,   40",
            "100,  1,  100",
            "100,  5,   500"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicar(first, second),
                    () -> first + " / " + second + " should equal " + expectedResult);
    }

}
