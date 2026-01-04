package lambda_interfaces.calculadora_area_geometrica.model;

public sealed interface Calculavel permits Circulo,Quadrado,Retangulo {

    double calcularArea();
    
}
