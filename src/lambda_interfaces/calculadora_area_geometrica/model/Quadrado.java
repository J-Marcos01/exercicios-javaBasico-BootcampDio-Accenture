package lambda_interfaces.calculadora_area_geometrica.model;

public final class Quadrado implements Calculavel {

    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
