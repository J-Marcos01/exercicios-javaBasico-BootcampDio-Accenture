package classes_encapsulamento_java.maquina_banho_pet;

public class MaquinaBanho {

    private boolean ocupada;
    private boolean limpa;
    private Pet petAtual;
    
    private int nivelShampoo;
    private int nivelAgua;

    private final int CAPACIDADE_MAXIMA_SHAMPOO = 10;
    private final int CAPACIDADE_MAXIMA_AGUA = 30;
    
    private final int CONSUMO_SHAMPOO_BANHO = 2;
    private final int CONSUMO_AGUA_BANHO = 10;
    private final int CONSUMO_SHAMPOO_LIMPEZA = 1;
    private final int CONSUMO_AGUA_LIMPEZA = 3;
    
    private final int QUANTIDADE_REFIL = 2;

    public MaquinaBanho() {
        this.ocupada = false;
        this.limpa = true;
        this.petAtual = null;
        this.nivelShampoo = CAPACIDADE_MAXIMA_SHAMPOO;
        this.nivelAgua = CAPACIDADE_MAXIMA_AGUA;
    }

    public void colocarPet(Pet pet) {
        if (ocupada) {
            System.out.println("ERRO: A máquina já está ocupada com o pet " + petAtual.getNomePet());
            return;
        }
        if (!limpa) {
            System.out.println("ERRO: A máquina está suja. Realize a limpeza antes de colocar o pet.");
            return;
        }
        
        this.petAtual = pet;
        this.ocupada = true;
        System.out.println("O pet " + pet.getNomePet() + " foi colocado na máquina.");
    }

    public void retirarPet() {
        if (!ocupada) {
            System.out.println("ERRO: Não há pet na máquina para retirar.");
            return;
        }

        System.out.println("Retirando o pet " + petAtual.getNomePet() + "...");

        if (!petAtual.isLimpo()) {
            System.out.println("ATENÇÃO: O pet saiu sujo. A máquina precisa ser higienizada.");
            this.limpa = false;
        }

        this.petAtual = null;
        this.ocupada = false;
    }

    public void darBanho() {
        if (!ocupada) {
            System.out.println("ERRO: Coloque um pet na máquina antes de iniciar o banho.");
            return;
        }

        if (petAtual.isLimpo()) {
            System.out.println("O pet já está limpo!");
            return;
        }

        if (!verificarNivelAgua(CONSUMO_AGUA_BANHO) || !verificarNivelShampoo(CONSUMO_SHAMPOO_BANHO)) {
            System.out.println("ERRO: Recursos insuficientes para o banho. Abasteça a máquina.");
            return;
        }

        this.nivelAgua -= CONSUMO_AGUA_BANHO;
        this.nivelShampoo -= CONSUMO_SHAMPOO_BANHO;
        this.petAtual.setLimpo(true);
        System.out.println("Banho finalizado! O pet " + petAtual.getNomePet() + " está cheiroso.");
    }

    public void limparMaquina() {
        if (ocupada) {
            System.out.println("ERRO: Retire o pet antes de limpar a máquina.");
            return;
        }
        
        if (limpa) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (!verificarNivelAgua(CONSUMO_AGUA_LIMPEZA) || !verificarNivelShampoo(CONSUMO_SHAMPOO_LIMPEZA)) {
            System.out.println("ERRO: Recursos insuficientes para limpeza.");
            return;
        }

        System.out.println("Realizando limpeza da máquina...");
        this.nivelAgua -= CONSUMO_AGUA_LIMPEZA;
        this.nivelShampoo -= CONSUMO_SHAMPOO_LIMPEZA;
        this.limpa = true;
        System.out.println("Limpeza concluída! Máquina pronta para uso.");
    }

    public void abastecerAgua() {
        if (nivelAgua + QUANTIDADE_REFIL <= CAPACIDADE_MAXIMA_AGUA) {
            nivelAgua += QUANTIDADE_REFIL;
            System.out.println("Abastecido 2L de água. Nível atual: " + nivelAgua);
        } else {
            System.out.println("Tanque de água cheio! Não cabe mais 2 litros.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + QUANTIDADE_REFIL <= CAPACIDADE_MAXIMA_SHAMPOO) {
            nivelShampoo += QUANTIDADE_REFIL;
            System.out.println("Abastecido 2L de shampoo. Nível atual: " + nivelShampoo);
        } else {
            System.out.println("Tanque de shampoo cheio! Não cabe mais 2 litros.");
        }
    }
    
    private boolean verificarNivelAgua(int quantidadeNecessaria) {
        return nivelAgua >= quantidadeNecessaria;
    }
    
    private boolean verificarNivelShampoo(int quantidadeNecessaria) {
        return nivelShampoo >= quantidadeNecessaria;
    }

    public int getNivelAgua() { return nivelAgua; }
    public int getNivelShampoo() { return nivelShampoo; }
    public boolean temPetNoBanho() { return ocupada; }
}