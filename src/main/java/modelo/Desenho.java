package modelo;

import java.util.ArrayList;
import java.util.List;

public class Desenho {

    private List<Figura> figuras = null;

    public Desenho() {
        figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public double getArea() {
        double total = 0;
        for (int i = 0; i < figuras.size(); i++) {
            total = total + figuras.get(i).getArea();
        }
        return total;
    }
}
