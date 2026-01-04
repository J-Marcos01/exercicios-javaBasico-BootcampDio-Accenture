package lambda_interfaces.calculadora_area_geometrica;

import java.util.List;
import lambda_interfaces.calculadora_area_geometrica.model.Circulo;
import lambda_interfaces.calculadora_area_geometrica.model.Quadrado;
import lambda_interfaces.calculadora_area_geometrica.model.Retangulo;

public class SistemaCalculo {
    public static void main(String[] args) {

        var figuras = List.of(
                new Circulo(5),
                new Retangulo(4, 6),
                new Quadrado(4));

        figuras.forEach(forma -> {
            System.out.println("Área: " + forma.calcularArea());
        });

    }
}
