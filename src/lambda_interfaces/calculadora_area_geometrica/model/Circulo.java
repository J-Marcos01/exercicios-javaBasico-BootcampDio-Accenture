package lambda_interfaces.calculadora_area_geometrica.model;

public final class Circulo implements Calculavel {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {      
        return Math.PI * Math.pow(raio, 2);
    }

}
