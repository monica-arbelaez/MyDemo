import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();


    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several sum")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSum(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @Test
    @DisplayName("Testing res: 1-1=0")
    public void res() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several res")
    @ParameterizedTest(name = "{4} - {1} = {3}")
    @CsvSource({
            "4,    1,   3",
            "1,    2,   -1",
            "49,  51,   -2",
            "1,  100,   -99"
    })
    public void severalRes(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.res(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
    @Test
    @DisplayName("Testing mul: 1*1=1")
    public void mul() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.mul(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several mul")
    @ParameterizedTest(name = "{0} * {1} = {0}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "49,  51, 2499",
            "1,  100,  100"
    })
    public void severalMul(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mul(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing div: 1/1=1")
    public void div() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several div")
    @ParameterizedTest(name = "{10} / {5} = {2}")
    @CsvSource({
            "10,    5,     2",
            "1,     1,     1",
            "50,    10,    5",
            "10,    2,     5"
    })
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divTriste: 1/0= error")
    public void divTriste() {
        // Arrange
        Long number1 = 1L;
        Long number2 = null;
        // Act
        var response = Assertions.assertThrows(RuntimeException.class, ()-> {
            Long result = basicCalculator.div(number1, number2);
        } );

        // Assert
        /*assertEquals(expectedValue, result);*/
    }

}