import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(7, calc.suma(5, 2));
    }

    @Test
    void testResta() {
        assertEquals(3, calc.resta(5, 2));
    }

    @Test
    void testMultiplica() {
        assertEquals(10, calc.multiplica(5, 2));
    }
}
