import org.example.CalculadoraIMC;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    @Test
    void testHomemAbaixoDoPeso() {
        assertEquals("Abaixo do peso", CalculadoraIMC.calcularIMC(20.6, 1.0, true));
    }

    @Test
    void testHomemNoPesoNormalLimiteInferior() {
        assertEquals("No peso normal", CalculadoraIMC.calcularIMC(20.7, 1.0, true));
    }

    @Test
    void testHomemNoPesoNormalLimiteSuperior() {
        assertEquals("No peso normal", CalculadoraIMC.calcularIMC(26.3, 1.0, true));
    }

    @Test
    void testHomemMarginalmenteAcimaDoPesoLimiteInferior() {
        assertEquals("Marginalmente acima do peso", CalculadoraIMC.calcularIMC(26.4, 1.0, true));
    }

    @Test
    void testHomemMarginalmenteAcimaDoPesoLimiteSuperior() {
        assertEquals("Marginalmente acima do peso", CalculadoraIMC.calcularIMC(27.7, 1.0, true));
    }

    @Test
    void testHomemAcimaDoPesoIdealLimiteInferior() {
        assertEquals("Acima do peso ideal", CalculadoraIMC.calcularIMC(27.8, 1.0, true));
    }

    @Test
    void testHomemAcimaDoPesoIdealLimiteSuperior() {
        assertEquals("Acima do peso ideal", CalculadoraIMC.calcularIMC(31.0, 1.0, true));
    }

    @Test
    void testHomemObeso() {
        assertEquals("Obeso", CalculadoraIMC.calcularIMC(31.1, 1.0, true));
    }

    @Test
    void testMulherAbaixoDoPeso() {
        assertEquals("Abaixo do peso", CalculadoraIMC.calcularIMC(19.0, 1.0, false));
    }

    @Test
    void testMulherNoPesoNormalLimiteInferior() {
        assertEquals("No peso normal", CalculadoraIMC.calcularIMC(19.1, 1.0, false));
    }

    @Test
    void testMulherNoPesoNormalLimiteSuperior() {
        assertEquals("No peso normal", CalculadoraIMC.calcularIMC(25.7, 1.0, false));
    }

    @Test
    void testMulherMarginalmenteAcimaDoPesoLimiteInferior() {
        assertEquals("Marginalmente acima do peso", CalculadoraIMC.calcularIMC(25.8, 1.0, false));
    }

    @Test
    void testMulherMarginalmenteAcimaDoPesoLimiteSuperior() {
        assertEquals("Marginalmente acima do peso", CalculadoraIMC.calcularIMC(27.2, 1.0, false));
    }

    @Test
    void testMulherAcimaDoPesoIdealLimiteInferior() {
        assertEquals("Acima do peso ideal", CalculadoraIMC.calcularIMC(27.3, 1.0, false));
    }

    @Test
    void testMulherAcimaDoPesoIdealLimiteSuperior() {
        assertEquals("Acima do peso ideal", CalculadoraIMC.calcularIMC(32.2, 1.0, false));
    }

    @Test
    void testMulherObesa() {
        assertEquals("Obeso", CalculadoraIMC.calcularIMC(32.3, 1.0, false));
    }
}