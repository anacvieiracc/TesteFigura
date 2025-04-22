package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFigura {

    @Test
    void testGetCor() {
        Retangulo instance = new Retangulo();
        instance.setCor("Verde");
        String expResult = "Verde";
        assertEquals(expResult, instance.getCor());
    }
}


