package lambda_interfaces.calculadora_area_geometrica.model;

public final class Retangulo implements Calculavel {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
}
