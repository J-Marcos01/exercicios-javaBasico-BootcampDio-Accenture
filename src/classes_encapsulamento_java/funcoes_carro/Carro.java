package classes_encapsulamento_java.funcoes_carro;

public class Carro {

    private boolean motorLigado;
    private int velocidade;
    private int marcha;

    private final int VELOCIDADE_MAXIMA = 120;
    private final int VELOCIDADE_MINIMA = 0;

    public Carro() {
        this.motorLigado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligarMotor() {
        if (!this.motorLigado) {
            this.motorLigado = true;
            this.velocidade = 0;
            System.out.println("Motor ligado, carro em ponto morto.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado && this.marcha == 0 && this.velocidade == 0) {
            this.motorLigado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Não é possível desligar o motor enquanto o carro está em movimento ou engatado.");
        }

    }

    public void acelerar() {

        if (!validarMotorLigado())
            return;
        if (this.marcha == 0) {
            System.out.println("ERRO: Não é possível acelerar em ponto morto (Marcha 0). Engate a 1ª marcha.");
            return;
        }

        if (this.velocidade < VELOCIDADE_MAXIMA) {
            int limiteMaximoMarchaAtual = obterLimiteVelocidadePorMarcha(this.marcha);

            if (this.velocidade < limiteMaximoMarchaAtual) {
                this.velocidade += 1;
                System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
            } else {
                System.out.println("ERRO: Motor gritando! Troque para a próxima marcha para passar de "
                        + limiteMaximoMarchaAtual + " km/h.");
            }
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void diminuirVelocidade() {
        if (!validarMotorLigado())
            return;

        if (this.velocidade > VELOCIDADE_MINIMA) {
            this.velocidade -= 1;
            System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");

            verificarSePrecisaReduzirMarcha();
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!validarMotorLigado())
            return;

        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para a " + direcao + ".");
        } else {
            System.out.println("ERRO: Para virar, a velocidade deve estar entre 1km/h e 40km/h.");
        }
    }

    public void mudarMarcha(int novaMarcha) {
        if (!validarMotorLigado())
            return;

        if (Math.abs(novaMarcha - this.marcha) > 1 && novaMarcha != 0) {
            System.out.println("ERRO: Você deve trocar as marchas sequencialmente. Marcha Atual: " + this.marcha);
            return;
        }

        if (validarFaixaVelocidadeParaMarcha(novaMarcha)) {
            this.marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + this.marcha);
        } else {
            System.out.println("ERRO: Velocidade incompatível para a marcha " + novaMarcha);
        }
    }

    private int obterLimiteVelocidadePorMarcha(int marcha) {
        return switch (marcha) {
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };
    }

    private boolean validarFaixaVelocidadeParaMarcha(int marcha) {
        return switch (marcha) {
            case 0 -> this.velocidade == 0;
            case 1 -> this.velocidade >= 0 && this.velocidade <= 20;
            case 2 -> this.velocidade >= 20 && this.velocidade <= 40;
            case 3 -> this.velocidade >= 40 && this.velocidade <= 60;
            case 4 -> this.velocidade >= 60 && this.velocidade <= 80;
            case 5 -> this.velocidade >= 80 && this.velocidade <= 100;
            case 6 -> this.velocidade >= 100 && this.velocidade <= 120;
            default -> false;
        };
    }

    private void verificarSePrecisaReduzirMarcha() {
        int limiteMinimo = (this.marcha - 1) * 20;
        if (this.marcha > 0 && this.velocidade < limiteMinimo) {
            System.out.println("Alerta: O motor está engasgando! Reduza a marcha.");
        }
    }

    private boolean validarMotorLigado() {
        if (!motorLigado) {
            System.out.println("ERRO: O motor está desligado.");
            return false;
        }
        return true;
    }

    public String getStatusMotor() {
        return motorLigado ? "Ligado" : "Desligado";
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }
}