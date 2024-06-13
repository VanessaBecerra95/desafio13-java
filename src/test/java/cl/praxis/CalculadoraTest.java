package cl.praxis;
import cl.praxis.model.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;

@DisplayName("Test para la clase Calculadora")
public class CalculadoraTest {
    private static Logger logger = Logger.getLogger(CalculadoraTest.class.getName());
    private final Calculadora calculadora = new Calculadora();

    @BeforeAll
    public static void init(){
        logger.warning("-> Inicio de los test de la clase Calculadora");
    }

    @BeforeEach
    public void initEach(){
        logger.info("-> Inicio del test");
    }

    @AfterEach
    public void closeEach(){
        logger.info("-> Fin del test");
    }

    @AfterAll
    public static void close(){
        logger.warning("-> Fin de los test de la clase Calculadora");

    }

    @Test
    public void testSumar() {
        logger.info("Test para sumar dos números");
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, calculadora.sumar(5, 3));
        logger.info("El test para sumar dos números funciona correctamente");
    }

    @Test
    public void testRestar() {
        logger.info("Test para restar dos números");
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(3, 2));
        logger.info("El test para restar dos números funciona correctamente");
    }

    @Test
    public void testMultiplicar() {
        logger.info("Test para multiplicar dos números");
        Calculadora calculadora = new Calculadora();
        assertEquals(20, calculadora.multiplicar(10, 2));
        logger.info("El test para multiplicar dos números funciona correctamente");
    }

    @Test
    public void testDividir() {
        logger.info("Test para dividir dos números");
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividir(10, 2));
        logger.info("El test para dividir dos números funciona correctamente");
    }

    @Test
    public void testDividirPorCero() {
        logger.info("Test para dividir por cero");
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
        logger.info("El test para dividir por cero funciona correctamente");
    }

}
