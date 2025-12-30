package classes_encapsulamento_java.conta_bancaria;

public class ContaBancaria {

    private static int contadorContas = 0;
    private int numeroConta;
    private double saldo;
    private double limiteChequeEspecial;
    private double saldoChequeUsado;

    public ContaBancaria(double depositoInicial) {
        contadorContas++;
        this.numeroConta = 1000 + contadorContas;
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.saldoChequeUsado = 0;
    }

    public boolean sacar(double valor) {
        var disponivelTotal = this.saldo + (this.limiteChequeEspecial - this.saldoChequeUsado);
        if (valor <= disponivelTotal) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else {
                var valorRestante = valor - this.saldo;
                this.saldo = 0;
                this.saldoChequeUsado += valorRestante;
            }
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (this.saldoChequeUsado > 0) {
            if (valor >= this.saldoChequeUsado) {
                var taxa = this.saldoChequeUsado * 0.20;
                System.out.println("Cobrando taxa de juros de 20% do cheque especial: R$ " + taxa);
                valor -= taxa;

                if (valor >= this.saldoChequeUsado) {
                    valor -= this.saldoChequeUsado;
                    this.saldoChequeUsado = 0;
                } else {
                    this.saldoChequeUsado -= valor;
                    valor = 0;
                }
            }
        }
        this.saldo += valor;
    }

    public boolean pagarBoleto(double valor) {

        boolean sucesso = this.sacar(valor);
        if (sucesso) {
            System.out.println("Boleto de R$ " + valor + " pago com sucesso!");
        } else {
            System.out.println("Erro ao pagar boleto: Saldo insuficiente.");
        }
        return sucesso;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getDividaCheque() {
        return saldoChequeUsado;
    }

}
