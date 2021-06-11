import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BasicCalculator {
    private static final Logger logger =  LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long res(Long number1, Long number2) {
        logger.info( "Resta {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long mul(Long number1, Long number2) {
        logger.info( "Multiplicacion {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Long div(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        return number1 / number2;
    }

}
