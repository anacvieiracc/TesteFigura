package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestDesenho {

    @Test
    void testAdicionar() {
        Desenho desenho = new Desenho();
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        Retangulo retangulo = new Retangulo("", baseRetangulo, alturaRetangulo);
        desenho.adicionar(retangulo);
        assertEquals(1, desenho.getFiguras().size());
    }

    @Test
    void testGetArea() {
        Desenho desenho = new Desenho();
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        double retornoEsperadoRetangulo = 6;
        Retangulo retangulo = new Retangulo("", baseRetangulo, alturaRetangulo);
        desenho.adicionar(retangulo);
        double alturaTriangulo = 3;
        double baseTriangulo = 2;
        double retornoEsperadoTriangulo = 3.0;
        Triangulo triangulo = new Triangulo("", baseTriangulo, alturaTriangulo);
        desenho.adicionar(triangulo);
        double areaDesenhoEsperado = retornoEsperadoRetangulo + retornoEsperadoTriangulo;
        double retornoFeito = desenho.getArea();
        assertEquals(areaDesenhoEsperado, retornoFeito);
    }
}