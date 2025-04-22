package principal;

import modelo.Desenho;
import modelo.Retangulo;
import modelo.Triangulo;
import javax.swing.JOptionPane;

public class TesteFigura {

    public static void main(String[] args) {
        String opcao = "";
        Desenho desenho = new Desenho();
        while (!opcao.equals("5")) {
            opcao = JOptionPane.showInputDialog("1 - Adiciona um Triângulo " + "\n2 - Adiciona um Retângulo " 
                    + "\n3 - Listar figuras do desenho" + "\n4 - Área desenho" + "\n5 - Sair");
            
            switch (opcao) {
                case "1": {
                    Triangulo triangulo = new Triangulo();
                    triangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Triângulo"));
                    triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triângulo")));
                    triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triângulo")));
                    JOptionPane.showMessageDialog(null, "Área Triangulo: " + triangulo.getArea());
                    desenho.adicionar(triangulo);
                    break;
                }

                case "2": {
                    Retangulo retangulo = new Retangulo();
                    retangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Retângulo"));
                    retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retângulo")));
                    retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Retângulo")));
                    JOptionPane.showMessageDialog(null, "Área Retângulo: " + retangulo.getArea());
                    desenho.adicionar(retangulo);
                    break;
                }
                case "3": {
                    System.out.println("Lista das figuras do desenho");
                    for (int i = 0; i < desenho.getFiguras().size(); i++) {
                        System.out.println(i + "-" + desenho.getFiguras().get(i).getClass().getName() + " com area:" + desenho.getFiguras().get(i).getArea());
                    }
                    break;
                }
                case "4": {
                    JOptionPane.showMessageDialog(null, "Área total do desenho: " + desenho.getArea());
                    break;
                }
            }
        }
    }
}