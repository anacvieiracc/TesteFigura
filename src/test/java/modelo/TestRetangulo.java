package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestRetangulo {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 6;
        Retangulo retangulo = new Retangulo("", base, altura);
        double retornoFeito = retangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
